// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class UpdateDataSourceRequest extends TeaModel {
    /**
     * <p>Refer to the example JSON for parameter values. The parameters are explained as follows:</p>
     * <ul>
     * <li>dsId  --  Required  --  Data source ID</li>
     * <li>userId -- Optional -- User identity for modifying the data source, quickbi\&quot;s userId. If provided, it will use the current userId for modification.</li>
     * <li>dsType -- Required -- Data source type, not allowed to be modified, just pass the data source type.</li>
     * <li>showName -- Optional -- Display name of the data source.</li>
     * <li>address -- Optional -- Database connection string (domain or IP)</li>
     * <li>port -- Optional -- Port</li>
     * <li>schema --  Optional --  Database schema, only required for databases that support schemas. Example: sqlserver uses dbo by default; mysql does not support schemas.</li>
     * <li>instance -- Optional -- Instance db</li>
     * <li>username -- Optional -- Database username/ak</li>
     * <li>password -- Optional -- Database key</li>
     * <li>config -- Optional -- Additional database configuration items. Note that this data should be consistent with the different config parameters passed during creation for different data sources. Fields that do not need to be modified do not require parameters. For fields where parameters are passed, the default is to modify according to the passed parameters (including empty strings).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;schema&quot;: &quot;schema&quot;,
     *     &quot;userId&quot;:&quot;S<em><strong><strong>46345&quot;,
     *     &quot;password&quot;: &quot;Ta</strong></strong>34&quot;,
     *     &quot;showName&quot;: &quot;TEST&quot;,
     *     &quot;address&quot;: &quot;11****</em>.55&quot;,
     *     &quot;instance&quot;: &quot;quickbi_test&quot;,
     *     &quot;dsId&quot;: &quot;34d6d******3ca8ac267&quot;,
     *     &quot;port&quot;: &quot;3306&quot;,
     *     &quot;dsType&quot;: &quot;mysql&quot;,
     *     &quot;username&quot;: &quot;root&quot;,
     *     &quot;config&quot;:  {
     *         &quot;initialSql&quot;: &quot;Set timezone = \&quot;-10\&quot;&quot;
     *     }
     * }</p>
     */
    @NameInMap("UpdateModel")
    public String updateModel;

    public static UpdateDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataSourceRequest self = new UpdateDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataSourceRequest setUpdateModel(String updateModel) {
        this.updateModel = updateModel;
        return this;
    }
    public String getUpdateModel() {
        return this.updateModel;
    }

}
