/*
 * Copyright (c) 2013-2016 GraphAware
 *
 * This file is part of the GraphAware Framework.
 *
 * GraphAware Framework is free software: you can redistribute it and/or modify it under the terms of
 * the GNU General Public License as published by the Free Software Foundation, either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details. You should have received a copy of
 * the GNU General Public License along with this program.  If not, see
 * <http://www.gnu.org/licenses/>.
 */

package com.graphaware.reco.generic.transform;

import com.graphaware.reco.generic.context.Context;
import com.graphaware.reco.generic.result.PartialScore;

/**
 * {@link ScoreTransformer} that performs no transformation. Singleton.
 */
public final class NoTransformation<OUT> implements ScoreTransformer<OUT> {

    private static final NoTransformation INSTANCE = new NoTransformation();

    public static <OUT> NoTransformation<OUT> getInstance() {
        return INSTANCE;
    }

    private NoTransformation() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PartialScore transform(OUT item, PartialScore score, Context<? extends OUT, ?> context) {
        return score;
    }
}
