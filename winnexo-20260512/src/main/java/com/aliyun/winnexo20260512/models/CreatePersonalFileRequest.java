// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreatePersonalFileRequest extends TeaModel {
    /**
     * <p>The platform application token issued by the console. If this parameter is passed, the operation is executed as the user specified by opsUserId or opsUserCode.</p>
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
     * <p>created by eventbridge</p>
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
     * <p>The file name extension, such as pdf or docx. This parameter is optional.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("fileExt")
    public String fileExt;

    /**
     * <p>The file name.</p>
     * 
     * <strong>example:</strong>
     * <p>0250705120003-2026-04-28-19-22-20.wav</p>
     */
    @NameInMap("fileName")
    public String fileName;

    /**
     * <p>The file path.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bi/batch-query-service.app.yaml</p>
     */
    @NameInMap("filePath")
    public String filePath;

    /**
     * <p>The publicly accessible URL of the DingTalk online document.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/winnexo/resource">https://example.com/winnexo/resource</a></p>
     */
    @NameInMap("filePublicUrl")
    public String filePublicUrl;

    /**
     * <p>The file record ID, which corresponds to settings.file_record_id. This parameter is optional.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleFileRecordId</p>
     */
    @NameInMap("fileRecordId")
    public String fileRecordId;

    /**
     * <p>The pipeline name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sys_first_new_v3_b</p>
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
     * <p>The list of resource tag JSON strings.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;Important&quot;, &quot;File&quot;]</p>
     */
    @NameInMap("sourceTags")
    public String sourceTags;

    /**
     * <p>The tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1798284341201499</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static CreatePersonalFileRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePersonalFileRequest self = new CreatePersonalFileRequest();
        return TeaModel.build(map, self);
    }

    public CreatePersonalFileRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public CreatePersonalFileRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePersonalFileRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreatePersonalFileRequest setFileExt(String fileExt) {
        this.fileExt = fileExt;
        return this;
    }
    public String getFileExt() {
        return this.fileExt;
    }

    public CreatePersonalFileRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreatePersonalFileRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public CreatePersonalFileRequest setFilePublicUrl(String filePublicUrl) {
        this.filePublicUrl = filePublicUrl;
        return this;
    }
    public String getFilePublicUrl() {
        return this.filePublicUrl;
    }

    public CreatePersonalFileRequest setFileRecordId(String fileRecordId) {
        this.fileRecordId = fileRecordId;
        return this;
    }
    public String getFileRecordId() {
        return this.fileRecordId;
    }

    public CreatePersonalFileRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreatePersonalFileRequest setOperatingObjectName(String operatingObjectName) {
        this.operatingObjectName = operatingObjectName;
        return this;
    }
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    public CreatePersonalFileRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public CreatePersonalFileRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public CreatePersonalFileRequest setSourceTags(String sourceTags) {
        this.sourceTags = sourceTags;
        return this;
    }
    public String getSourceTags() {
        return this.sourceTags;
    }

    public CreatePersonalFileRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
