// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateCustomOrgResponseBody extends TeaModel {
    /**
     * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>注册成功的组织标识</p>
     * 
     * <strong>example:</strong>
     * <p>exampleCorpId</p>
     */
    @NameInMap("corpId")
    public String corpId;

    /**
     * <p>组织展示名称</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("corpName")
    public String corpName;

    /**
     * <p>错误描述，成功时为空</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>平台类型，固定为 custom</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("platformType")
    public String platformType;

    /**
     * <p>请求追踪 ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateCustomOrgResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomOrgResponseBody self = new CreateCustomOrgResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCustomOrgResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateCustomOrgResponseBody setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public CreateCustomOrgResponseBody setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

    public CreateCustomOrgResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateCustomOrgResponseBody setPlatformType(String platformType) {
        this.platformType = platformType;
        return this;
    }
    public String getPlatformType() {
        return this.platformType;
    }

    public CreateCustomOrgResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
