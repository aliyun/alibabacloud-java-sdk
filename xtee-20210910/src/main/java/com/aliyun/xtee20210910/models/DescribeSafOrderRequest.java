// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSafOrderRequest extends TeaModel {
    /**
     * <p>Set the language type for request and response, default value is <strong>zh</strong>. Values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentPage")
    public Integer currentPage;

    /**
     * <p>End date.</p>
     * 
     * <strong>example:</strong>
     * <p>1755076800000</p>
     */
    @NameInMap("endDate")
    public String endDate;

    /**
     * <p>Product code.</p>
     * 
     * <strong>example:</strong>
     * <p>saf_de</p>
     */
    @NameInMap("exactProductCode")
    public String exactProductCode;

    /**
     * <p>Page size, default value is 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>Region code.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>Start time.</p>
     * 
     * <strong>example:</strong>
     * <p>1752076800000</p>
     */
    @NameInMap("startDate")
    public String startDate;

    public static DescribeSafOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSafOrderRequest self = new DescribeSafOrderRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSafOrderRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSafOrderRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSafOrderRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public DescribeSafOrderRequest setExactProductCode(String exactProductCode) {
        this.exactProductCode = exactProductCode;
        return this;
    }
    public String getExactProductCode() {
        return this.exactProductCode;
    }

    public DescribeSafOrderRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSafOrderRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeSafOrderRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
