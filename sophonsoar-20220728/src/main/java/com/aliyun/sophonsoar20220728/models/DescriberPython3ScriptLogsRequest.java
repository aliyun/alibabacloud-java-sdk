// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescriberPython3ScriptLogsRequest extends TeaModel {
    /**
     * <p>The language of the request and response.</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese</p>
     * </li>
     * <li><p><strong>en</strong>: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The UUID that is returned when you run a Python 3 script.</p>
     * <blockquote>
     * <p>Call the <a href="~~RunPython3Script~~">RunPython3Script</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>69edc2b4-c95c-424f-9114-xxxxxxx</p>
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
