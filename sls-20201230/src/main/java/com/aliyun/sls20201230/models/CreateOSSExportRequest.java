// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateOSSExportRequest extends TeaModel {
    /**
     * <p>The configuration of the job.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("configuration")
    public OSSExportConfiguration configuration;

    /**
     * <p>The description of the job.</p>
     * 
     * <strong>example:</strong>
     * <p>创建一个OSS投递任务</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The display name of the job.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-oss-job</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>The name of the job. The name must meet the following requirements:</p>
     * <p>The job name must be unique within the project.</p>
     * <ul>
     * <li><p>The name can contain only lowercase letters, digits, hyphens (-), and underscores (_).</p>
     * </li>
     * <li><p>The name must start and end with a lowercase letter or a digit.</p>
     * </li>
     * <li><p>The name must be 2 to 64 characters in length.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>export-oss-1234567890-123456</p>
     */
    @NameInMap("name")
    public String name;

    public static CreateOSSExportRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOSSExportRequest self = new CreateOSSExportRequest();
        return TeaModel.build(map, self);
    }

    public CreateOSSExportRequest setConfiguration(OSSExportConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }
    public OSSExportConfiguration getConfiguration() {
        return this.configuration;
    }

    public CreateOSSExportRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateOSSExportRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateOSSExportRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
