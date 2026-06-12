// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateETLRequest extends TeaModel {
    /**
     * <p>The detailed configuration of the data transformation job.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("configuration")
    public ETLConfiguration configuration;

    /**
     * <p>The description of the data transformation job.</p>
     * 
     * <strong>example:</strong>
     * <p>this is ETL</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The display name of the data transformation job.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sls-test-etl</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>The job name. The naming convention is as follows:</p>
     * <p>The job name must be unique within the project.</p>
     * <ul>
     * <li><p>The name can contain only lowercase letters, digits, hyphens (-), and underscores (_).</p>
     * </li>
     * <li><p>The name must start and end with a lowercase letter or a digit.</p>
     * </li>
     * <li><p>The length must be 2 to 64 characters.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>etl-123456</p>
     */
    @NameInMap("name")
    public String name;

    public static CreateETLRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateETLRequest self = new CreateETLRequest();
        return TeaModel.build(map, self);
    }

    public CreateETLRequest setConfiguration(ETLConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }
    public ETLConfiguration getConfiguration() {
        return this.configuration;
    }

    public CreateETLRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateETLRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateETLRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
