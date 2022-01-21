// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oms20160615.models;

import com.aliyun.tea.*;

public class GetOpenApiConfigResponseBody extends TeaModel {
    @NameInMap("Compressed")
    public Boolean compressed;

    @NameInMap("Data")
    public String data;

    @NameInMap("DataType")
    public String dataType;

    @NameInMap("ProductName")
    public String productName;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SiteBid")
    public String siteBid;

    @NameInMap("TableName")
    public String tableName;

    public static GetOpenApiConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOpenApiConfigResponseBody self = new GetOpenApiConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOpenApiConfigResponseBody setCompressed(Boolean compressed) {
        this.compressed = compressed;
        return this;
    }
    public Boolean getCompressed() {
        return this.compressed;
    }

    public GetOpenApiConfigResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetOpenApiConfigResponseBody setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public GetOpenApiConfigResponseBody setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public GetOpenApiConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOpenApiConfigResponseBody setSiteBid(String siteBid) {
        this.siteBid = siteBid;
        return this;
    }
    public String getSiteBid() {
        return this.siteBid;
    }

    public GetOpenApiConfigResponseBody setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
