/*Copyright (C) 2024  深圳极向量科技有限公司 All Rights Reserved.

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.*/
package neatlogic.framework.tagent.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

/**
 * @author longrf
 * @date 2023/4/23 10:29
 */

public class TagentAccountNotFoundException extends ApiRuntimeException {

    public TagentAccountNotFoundException(Long id) {
        super("nfte.tagentaccountnotfoundexception.tagentaccountnotfoundexception.id", id.toString());
    }

    public TagentAccountNotFoundException(String ip, Integer port) {
        super("nfte.tagentaccountnotfoundexception.tagentaccountnotfoundexception.ipport", ip, port);
    }
}
