// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateUserAnalyzerRequest extends TeaModel {
    /**
     * <p>The name of the basic analyzer.</p>
     * 
     * <strong>example:</strong>
     * <p>Chinese - general analysis</p>
     */
    @NameInMap("business")
    public String business;

    /**
     * <p>The application ID for the custom model-based analyzer.</p>
     * 
     * <strong>example:</strong>
     * <p>110123123</p>
     */
    @NameInMap("businessAppGroupId")
    public String businessAppGroupId;

    /**
     * <p>The type of the basic analyzer. Valid values: AUTO, MODEL, SYSTEM, and USER.</p>
     * 
     * <strong>example:</strong>
     * <p>AUTO</p>
     */
    @NameInMap("businessType")
    public String businessType;

    /**
     * <p>The name of the analyzer.</p>
     * 
     * <strong>example:</strong>
     * <p>jmbon_analyzer</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The engine type. Valid values: HA3 and ES.</p>
     * 
     * <strong>example:</strong>
     * <p>HA3</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><p>true: sends a check request without creating the analyzer. The system checks the AccessKey, RAM user authorization, and required parameters.</p>
     * </li>
     * <li><p>false (default): sends a regular request to create the analyzer.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static CreateUserAnalyzerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserAnalyzerRequest self = new CreateUserAnalyzerRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserAnalyzerRequest setBusiness(String business) {
        this.business = business;
        return this;
    }
    public String getBusiness() {
        return this.business;
    }

    public CreateUserAnalyzerRequest setBusinessAppGroupId(String businessAppGroupId) {
        this.businessAppGroupId = businessAppGroupId;
        return this;
    }
    public String getBusinessAppGroupId() {
        return this.businessAppGroupId;
    }

    public CreateUserAnalyzerRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public CreateUserAnalyzerRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateUserAnalyzerRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateUserAnalyzerRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
