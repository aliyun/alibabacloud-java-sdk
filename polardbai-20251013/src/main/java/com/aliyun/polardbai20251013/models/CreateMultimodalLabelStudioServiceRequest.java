// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class CreateMultimodalLabelStudioServiceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-2ze454l20me07****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DatasetIds")
    public java.util.List<String> datasetIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:service-admin@db4ai.com">service-admin@db4ai.com</a></p>
     */
    @NameInMap("Username")
    public String username;

    public static CreateMultimodalLabelStudioServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMultimodalLabelStudioServiceRequest self = new CreateMultimodalLabelStudioServiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateMultimodalLabelStudioServiceRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateMultimodalLabelStudioServiceRequest setDatasetIds(java.util.List<String> datasetIds) {
        this.datasetIds = datasetIds;
        return this;
    }
    public java.util.List<String> getDatasetIds() {
        return this.datasetIds;
    }

    public CreateMultimodalLabelStudioServiceRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateMultimodalLabelStudioServiceRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
