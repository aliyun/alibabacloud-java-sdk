// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateGraphInfoResponseBody extends TeaModel {
    /**
     * <p>更新后的业务说明，未设置时为空</p>
     * 
     * <strong>example:</strong>
     * <p>客户域语义图谱</p>
     */
    @NameInMap("businessProfile")
    public String businessProfile;

    /**
     * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>更新后的图谱展示名，未设置时为空</p>
     * 
     * <strong>example:</strong>
     * <p>CRM 图谱</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>图谱名称</p>
     * 
     * <strong>example:</strong>
     * <p>crm_graph</p>
     */
    @NameInMap("graphName")
    public String graphName;

    /**
     * <p>错误描述，成功时为空</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>请求追踪 ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>是否更新成功</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("updated")
    public Boolean updated;

    public static UpdateGraphInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateGraphInfoResponseBody self = new UpdateGraphInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateGraphInfoResponseBody setBusinessProfile(String businessProfile) {
        this.businessProfile = businessProfile;
        return this;
    }
    public String getBusinessProfile() {
        return this.businessProfile;
    }

    public UpdateGraphInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateGraphInfoResponseBody setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public UpdateGraphInfoResponseBody setGraphName(String graphName) {
        this.graphName = graphName;
        return this;
    }
    public String getGraphName() {
        return this.graphName;
    }

    public UpdateGraphInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateGraphInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateGraphInfoResponseBody setUpdated(Boolean updated) {
        this.updated = updated;
        return this;
    }
    public Boolean getUpdated() {
        return this.updated;
    }

}
