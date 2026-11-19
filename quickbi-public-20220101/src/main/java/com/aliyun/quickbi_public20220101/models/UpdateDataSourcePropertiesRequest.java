// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class UpdateDataSourcePropertiesRequest extends TeaModel {
    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>ssss</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The data source ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7AAB95D-*****-****-*4FC0C976</p>
     */
    @NameInMap("DsId")
    public String dsId;

    /**
     * <p>The owner of the data source. Set this parameter to the user ID in Quick BI.</p>
     * 
     * <strong>example:</strong>
     * <p>sss</p>
     */
    @NameInMap("QuickBIOwnerId")
    public String quickBIOwnerId;

    /**
     * <p>The display name of the data source.</p>
     * 
     * <strong>example:</strong>
     * <p>wls</p>
     */
    @NameInMap("ShowName")
    public String showName;

    public static UpdateDataSourcePropertiesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataSourcePropertiesRequest self = new UpdateDataSourcePropertiesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataSourcePropertiesRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateDataSourcePropertiesRequest setDsId(String dsId) {
        this.dsId = dsId;
        return this;
    }
    public String getDsId() {
        return this.dsId;
    }

    public UpdateDataSourcePropertiesRequest setQuickBIOwnerId(String quickBIOwnerId) {
        this.quickBIOwnerId = quickBIOwnerId;
        return this;
    }
    public String getQuickBIOwnerId() {
        return this.quickBIOwnerId;
    }

    public UpdateDataSourcePropertiesRequest setShowName(String showName) {
        this.showName = showName;
        return this;
    }
    public String getShowName() {
        return this.showName;
    }

}
