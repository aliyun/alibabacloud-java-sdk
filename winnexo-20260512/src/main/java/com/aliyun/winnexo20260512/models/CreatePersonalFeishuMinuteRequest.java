// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreatePersonalFeishuMinuteRequest extends TeaModel {
    /**
     * <p>The credential ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleCredentialId</p>
     */
    @NameInMap("credentialId")
    public String credentialId;

    /**
     * <p>The resource description.</p>
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
     * <p>The Lark Minutes token (unique identifier of the minutes record, required).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("minuteToken")
    public String minuteToken;

    /**
     * <p>The resource name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>_DevsAF_19df1a74-a740-449a-bd7a-9acb39e00f25</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The name of the digital employee (operating object name, optional).</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("operatingObjectName")
    public String operatingObjectName;

    /**
     * <p>The tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1iSgnW4pARwoPUd5D5nuCNwiEiE</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static CreatePersonalFeishuMinuteRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePersonalFeishuMinuteRequest self = new CreatePersonalFeishuMinuteRequest();
        return TeaModel.build(map, self);
    }

    public CreatePersonalFeishuMinuteRequest setCredentialId(String credentialId) {
        this.credentialId = credentialId;
        return this;
    }
    public String getCredentialId() {
        return this.credentialId;
    }

    public CreatePersonalFeishuMinuteRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePersonalFeishuMinuteRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreatePersonalFeishuMinuteRequest setMinuteToken(String minuteToken) {
        this.minuteToken = minuteToken;
        return this;
    }
    public String getMinuteToken() {
        return this.minuteToken;
    }

    public CreatePersonalFeishuMinuteRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreatePersonalFeishuMinuteRequest setOperatingObjectName(String operatingObjectName) {
        this.operatingObjectName = operatingObjectName;
        return this;
    }
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    public CreatePersonalFeishuMinuteRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
