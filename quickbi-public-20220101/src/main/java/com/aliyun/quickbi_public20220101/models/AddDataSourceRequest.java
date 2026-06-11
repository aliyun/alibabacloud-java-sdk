// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AddDataSourceRequest extends TeaModel {
    /**
     * <p>To construct the request payload, you can replicate the add data source process in the Quick BI console. On the Add Data Source page, when you click Test Connection, the restapi/datasource/detect API is called. Use this API call\&quot;s payload as a template, ensuring that the provided userId and workspaceId exist in your Quick BI environment.</p>
     * <blockquote>
     * <p>Notice: A few data source types are not supported. If your parameters match the test API request payload but the request still fails, the data source type is likely not supported by this OpenAPI.
     * Notice: Do not include the <code>encode</code> field in your request. This API does not support creating data sources in encrypted mode or using authentication methods that require file uploads.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;userId&quot;: &quot;235345xxxxx24336&quot;,
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
