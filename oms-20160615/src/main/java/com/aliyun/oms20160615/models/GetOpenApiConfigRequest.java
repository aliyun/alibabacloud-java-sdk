// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oms20160615.models;

import com.aliyun.tea.*;

public class GetOpenApiConfigRequest extends TeaModel {
    @NameInMap("CompressEnable")
    public Boolean compressEnable;

    @NameInMap("DataType")
    public String dataType;

    @NameInMap("ProductName")
    public String productName;

    @NameInMap("TableName")
    public String tableName;

    @NameInMap("siteBid")
    public String siteBid;

    public static GetOpenApiConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOpenApiConfigRequest self = new GetOpenApiConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetOpenApiConfigRequest setCompressEnable(Boolean compressEnable) {
        this.compressEnable = compressEnable;
        return this;
    }
    public Boolean getCompressEnable() {
        return this.compressEnable;
    }

    public GetOpenApiConfigRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public GetOpenApiConfigRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public GetOpenApiConfigRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public GetOpenApiConfigRequest setSiteBid(String siteBid) {
        this.siteBid = siteBid;
        return this;
    }
    public String getSiteBid() {
        return this.siteBid;
    }

}
