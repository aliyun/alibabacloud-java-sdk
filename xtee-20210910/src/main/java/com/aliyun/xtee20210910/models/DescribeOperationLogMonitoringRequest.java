// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeOperationLogMonitoringRequest extends TeaModel {
    /**
     * <p>Language type of the returned message. Values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>End date (in yyyy-MM-dd format, and the interval from the start date cannot exceed 90 days)</p>
     * 
     * <strong>example:</strong>
     * <p>2025-07-30</p>
     */
    @NameInMap("endDate")
    public String endDate;

    /**
     * <p>Region code.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>Start date (in yyyy-MM-dd format, and the interval from the current date cannot exceed 90 days)</p>
     * 
     * <strong>example:</strong>
     * <p>2025-07-19</p>
     */
    @NameInMap("startDate")
    public String startDate;

    /**
     * <p>Operator.</p>
     * 
     * <strong>example:</strong>
     * <p>root</p>
     */
    @NameInMap("userNameSearch")
    public String userNameSearch;

    public static DescribeOperationLogMonitoringRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOperationLogMonitoringRequest self = new DescribeOperationLogMonitoringRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOperationLogMonitoringRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeOperationLogMonitoringRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public DescribeOperationLogMonitoringRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeOperationLogMonitoringRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public DescribeOperationLogMonitoringRequest setUserNameSearch(String userNameSearch) {
        this.userNameSearch = userNameSearch;
        return this;
    }
    public String getUserNameSearch() {
        return this.userNameSearch;
    }

}
