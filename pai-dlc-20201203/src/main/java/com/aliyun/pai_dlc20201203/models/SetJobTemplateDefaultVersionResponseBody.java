// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class SetJobTemplateDefaultVersionResponseBody extends TeaModel {
    /**
     * <p>设置后的默认版本号</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("DefaultVersion")
    public Integer defaultVersion;

    /**
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-12T14:36:00Z</p>
     */
    @NameInMap("GmtModifyTime")
    public String gmtModifyTime;

    /**
     * <p>本次请求的 ID，用于诊断和答疑。</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-xxxxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetJobTemplateDefaultVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetJobTemplateDefaultVersionResponseBody self = new SetJobTemplateDefaultVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public SetJobTemplateDefaultVersionResponseBody setDefaultVersion(Integer defaultVersion) {
        this.defaultVersion = defaultVersion;
        return this;
    }
    public Integer getDefaultVersion() {
        return this.defaultVersion;
    }

    public SetJobTemplateDefaultVersionResponseBody setGmtModifyTime(String gmtModifyTime) {
        this.gmtModifyTime = gmtModifyTime;
        return this;
    }
    public String getGmtModifyTime() {
        return this.gmtModifyTime;
    }

    public SetJobTemplateDefaultVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
