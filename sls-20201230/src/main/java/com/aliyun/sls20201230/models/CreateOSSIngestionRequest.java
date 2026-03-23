// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateOSSIngestionRequest extends TeaModel {
    /**
     * <p>The OSS import configuration.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("configuration")
    public OSSIngestionConfiguration configuration;

    /**
     * <p>The job description.</p>
     * 
     * <strong>example:</strong>
     * <p>任务描述</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The display name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS导入</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>The job name. The naming conventions are as follows:</p>
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
     * <p>ingest-oss-123456</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The scheduling configuration. This parameter is optional. To meet specific timing requirements, such as importing data at 8:00 AM every Monday, use a cron expression.</p>
     */
    @NameInMap("schedule")
    public Schedule schedule;

    public static CreateOSSIngestionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOSSIngestionRequest self = new CreateOSSIngestionRequest();
        return TeaModel.build(map, self);
    }

    public CreateOSSIngestionRequest setConfiguration(OSSIngestionConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }
    public OSSIngestionConfiguration getConfiguration() {
        return this.configuration;
    }

    public CreateOSSIngestionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateOSSIngestionRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateOSSIngestionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateOSSIngestionRequest setSchedule(Schedule schedule) {
        this.schedule = schedule;
        return this;
    }
    public Schedule getSchedule() {
        return this.schedule;
    }

}
