// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescriberPython3ScriptLogsRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The UUID that is returned when the Python3 script is run.</p>
     * <blockquote>
     * <p> You can call the <a href="~~RunPython3Script~~">RunPython3Script</a> operation to query the UUID.</p>
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
