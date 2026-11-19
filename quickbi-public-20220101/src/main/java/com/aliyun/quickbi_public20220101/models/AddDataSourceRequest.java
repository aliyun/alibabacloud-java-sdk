// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AddDataSourceRequest extends TeaModel {
    /**
     * <p>You can refer to the logic of adding a data source on the Quick BI data source page. When you click <strong>Test Connection</strong>, the <code>restapi/datasource/detect</code> API operation is triggered. Simulate the request payload of this API operation by passing a JSON object of the same model, along with a valid <code>userId</code> and workspace ID in Quick BI. In version 7.1, the <code>userAsOwner</code> parameter is added. If you set this parameter to true, the data source is created as the specified <code>userId</code>.
     * <notice>A small number of data sources are not supported. If the parameters are the same as the request payload of the test API operation but the data source still fails to be added, the current data source type does not support creation through this API operation.</notice>
     * <notice>Do not pass the <code>encode</code> parameter. Currently, this API operation does not support encryption mode for creating data sources, and authentication that involves uploading files is not supported.</notice></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;userId&quot;: &quot;235345xxxxx24336&quot;,
     *   &quot;userAsOwner&quot;:true,
     *   &quot;workspaceId&quot;: &quot;235345xxxxx24336&quot;,
     *   &quot;dsType&quot;: &quot;postgresql&quot;,
     *   &quot;config&quot;: {
     *     &quot;category&quot;: &quot;local&quot;,
     *     &quot;customDriverId&quot;: null,
     *     &quot;ssl&quot;: false,
     *     &quot;uploadFile&quot;: true,
     *     &quot;sslConfig&quot;: null
     *   },
     *   &quot;showName&quot;: &quot;test&quot;,
     *   &quot;address&quot;: &quot;test&quot;,
     *   &quot;port&quot;: &quot;5432&quot;,
     *   &quot;instance&quot;: &quot;postgres&quot;,
     *   &quot;schema&quot;: &quot;public&quot;,
     *   &quot;userName&quot;: &quot;13<strong><strong>34&quot;,
     *   &quot;password&quot;: &quot;12</strong></strong>425&quot;,
     * }</p>
     */
    @NameInMap("AddModel")
    public String addModel;

    public static AddDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDataSourceRequest self = new AddDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public AddDataSourceRequest setAddModel(String addModel) {
        this.addModel = addModel;
        return this;
    }
    public String getAddModel() {
        return this.addModel;
    }

}
