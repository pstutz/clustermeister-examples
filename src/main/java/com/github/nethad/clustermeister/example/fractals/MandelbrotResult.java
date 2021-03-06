/*
 * Copyright 2012 The Clustermeister Team.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.nethad.clustermeister.example.fractals;

import java.io.Serializable;

/**
 *
 * @author thomas
 */
public class MandelbrotResult implements Serializable {
    private final int[] values;
    private final int[] colors;
    private final int row;

    public MandelbrotResult(int[] values, int[] colors, int row) {
        this.values = values;
        this.colors = colors;
        this.row = row;
    }

    /**
     * @return the values
     */
    public int[] getValues() {
        return values;
    }

    /**
     * @return the colors
     */
    public int[] getColors() {
        return colors;
    }

    public int getRow() {
        return row;
    }
    
    
    
}
