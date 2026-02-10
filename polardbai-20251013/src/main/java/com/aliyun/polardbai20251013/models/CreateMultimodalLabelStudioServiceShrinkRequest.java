// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class CreateMultimodalLabelStudioServiceShrinkRequest extends TeaModel {
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
    public String datasetIdsShrink;

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

    public static CreateMultimodalLabelStudioServiceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMultimodalLabelStudioServiceShrinkRequest self = new CreateMultimodalLabelStudioServiceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateMultimodalLabelStudioServiceShrinkRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateMultimodalLabelStudioServiceShrinkRequest setDatasetIdsShrink(String datasetIdsShrink) {
        this.datasetIdsShrink = datasetIdsShrink;
        return this;
    }
    public String getDatasetIdsShrink() {
        return this.datasetIdsShrink;
    }

    public CreateMultimodalLabelStudioServiceShrinkRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateMultimodalLabelStudioServiceShrinkRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
