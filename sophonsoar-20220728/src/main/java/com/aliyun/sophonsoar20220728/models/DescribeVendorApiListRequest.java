// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeVendorApiListRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>AddAssetCleanConfig</p>
     */
    @NameInMap("ApiName")
    public String apiName;

    /**
     * <strong>example:</strong>
     * <p>Create</p>
     */
    @NameInMap("KeyWord")
    public String keyWord;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>waf</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <strong>example:</strong>
     * <p>Azure</p>
     */
    @NameInMap("VendorCode")
    public String vendorCode;

    public static DescribeVendorApiListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVendorApiListRequest self = new DescribeVendorApiListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVendorApiListRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public DescribeVendorApiListRequest setKeyWord(String keyWord) {
        this.keyWord = keyWord;
        return this;
    }
    public String getKeyWord() {
        return this.keyWord;
    }

    public DescribeVendorApiListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVendorApiListRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeVendorApiListRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DescribeVendorApiListRequest setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
        return this;
    }
    public String getVendorCode() {
        return this.vendorCode;
    }

}
