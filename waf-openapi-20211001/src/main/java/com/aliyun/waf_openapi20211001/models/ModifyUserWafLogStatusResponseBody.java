// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyUserWafLogStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>wafng-logstore</p>
     */
    @NameInMap("LogStoreName")
    public String logStoreName;

    /**
     * <strong>example:</strong>
     * <p>wafng-project-14316572********-cn-hangzhou</p>
     */
    @NameInMap("ProjectName")
    public Boolean projectName;

    /**
     * <strong>example:</strong>
     * <p>D7861F61-5B61-<strong><strong>-A47C-6B19160</strong></strong>*</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyUserWafLogStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserWafLogStatusResponseBody self = new ModifyUserWafLogStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyUserWafLogStatusResponseBody setLogStoreName(String logStoreName) {
        this.logStoreName = logStoreName;
        return this;
    }
    public String getLogStoreName() {
        return this.logStoreName;
    }

    public ModifyUserWafLogStatusResponseBody setProjectName(Boolean projectName) {
        this.projectName = projectName;
        return this;
    }
    public Boolean getProjectName() {
        return this.projectName;
    }

    public ModifyUserWafLogStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
