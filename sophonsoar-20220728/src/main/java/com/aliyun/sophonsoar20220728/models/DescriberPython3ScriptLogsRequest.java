// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescriberPython3ScriptLogsRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <br>
     * <p>*   **zh** (default): Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The UUID that is returned when the Python3 script is run.</p>
     * <br>
     * <p>>  You can call the [RunPython3Script](~~RunPython3Script~~) operation to query the UUID.</p>
     */
    @NameInMap("RequestUuid")
    public String requestUuid;

    public static DescriberPython3ScriptLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescriberPython3ScriptLogsRequest self = new DescriberPython3ScriptLogsRequest();
        return TeaModel.build(map, self);
    }

    public DescriberPython3ScriptLogsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescriberPython3ScriptLogsRequest setRequestUuid(String requestUuid) {
        this.requestUuid = requestUuid;
        return this;
    }
    public String getRequestUuid() {
        return this.requestUuid;
    }

}
