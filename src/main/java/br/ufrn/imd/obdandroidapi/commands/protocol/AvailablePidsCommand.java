/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package br.ufrn.imd.obdandroidapi.commands.protocol;

import br.ufrn.imd.obdandroidapi.commands.PersistentCommand;
import br.ufrn.imd.obdandroidapi.enums.PidRange;

/**
 * Retrieve available PIDs ranging from 21 to 40.
 */
public class AvailablePidsCommand extends PersistentCommand {

    /**
     * Default constructor.
     *
     * @param command a {@link java.lang.String} object.
     */
    public AvailablePidsCommand(final PidRange range) {
        super(range.getValue());
    }

    /**
     * Copy constructor.
     *
     * @param other a {@link AvailablePidsCommand} object.
     */
    public AvailablePidsCommand(AvailablePidsCommand other) {
        super(other);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void performCalculations() {

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getFormattedResult() {
        return getCalculatedResult();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getCalculatedResult() {
        // First 4 characters are a copy of the command code, don't return those
        return String.valueOf(rawData).substring(4);
    }

}
