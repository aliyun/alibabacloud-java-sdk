// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescriberPython3ScriptLogsRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

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
