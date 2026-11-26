// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreatePersonalVoiceMeetingRequest extends TeaModel {
    /**
     * <p>The platform application token issued by the console. If this parameter is passed, the operation is performed as the user specified by opsUserId or opsUserCode.</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

    /**
     * <p>The pipeline description.</p>
     * 
     * <strong>example:</strong>
     * <p>update-JNQ9csEc6ArPPSXANH7O</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The directory ID.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleDirectoryId</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>The Yida attachment URL.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://emas-devops-cdn.aliyuncs.com/job/PJ859733644657824768/apk/release/com.czmp.vitanexusoff_release_v331.178.14-signed.apk">https://emas-devops-cdn.aliyuncs.com/job/PJ859733644657824768/apk/release/com.czmp.vitanexusoff_release_v331.178.14-signed.apk</a></p>
     */
    @NameInMap("fileUrl")
    public String fileUrl;

    /**
     * <p>The image name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>p-toolset-2a1461ff-59c1-4baa-9e19-966ec7c00004</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The name of the digital employee, which is the name of the operating object. This parameter is optional.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("operatingObjectName")
    public String operatingObjectName;

    /**
     * <p>The proxy user code, which is unique within the tenant. This parameter is used only when the application credential is configured as source_uid.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("opsUserCode")
    public String opsUserCode;

    /**
     * <p>The proxy user ID, which is the WINNEXO platform user ID. This parameter is used only when the application credential is configured as winnexo_uid.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("opsUserId")
    public String opsUserId;

    /**
     * <p>The list of resource tags in JSON string format.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;Important&quot;, &quot;Meeting&quot;]</p>
     */
    @NameInMap("sourceTags")
    public String sourceTags;

    /**
     * <p>The tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>474379246158592</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static CreatePersonalVoiceMeetingRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePersonalVoiceMeetingRequest self = new CreatePersonalVoiceMeetingRequest();
        return TeaModel.build(map, self);
    }

    public CreatePersonalVoiceMeetingRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public CreatePersonalVoiceMeetingRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePersonalVoiceMeetingRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreatePersonalVoiceMeetingRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public CreatePersonalVoiceMeetingRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreatePersonalVoiceMeetingRequest setOperatingObjectName(String operatingObjectName) {
        this.operatingObjectName = operatingObjectName;
        return this;
    }
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    public CreatePersonalVoiceMeetingRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public CreatePersonalVoiceMeetingRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public CreatePersonalVoiceMeetingRequest setSourceTags(String sourceTags) {
        this.sourceTags = sourceTags;
        return this;
    }
    public String getSourceTags() {
        return this.sourceTags;
    }

    public CreatePersonalVoiceMeetingRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
