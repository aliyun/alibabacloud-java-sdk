// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeExcuteNumRequest extends TeaModel {
    /**
     * <p>Service code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>saf_all</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>This field is currently unused and has no query significance.</p>
     * 
     * <strong>example:</strong>
     * <p>暂时不需要传入</p>
     */
    @NameInMap("Degree")
    public String degree;

    /**
     * <p>End date, format yyyy-MM-dd, e.g., 2025-03-13.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-03-15</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>Set the language type for requests and received messages, default value is <strong>zh</strong>. Values:</p>
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
     * <p>Request source IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>220.250.21.83</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>Start date, format yyyy-MM-dd, e.g., 2025-03-10.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-03-10</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    public static DescribeExcuteNumRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeExcuteNumRequest self = new DescribeExcuteNumRequest();
        return TeaModel.build(map, self);
    }

    public DescribeExcuteNumRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeExcuteNumRequest setDegree(String degree) {
        this.degree = degree;
        return this;
    }
    public String getDegree() {
        return this.degree;
    }

    public DescribeExcuteNumRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public DescribeExcuteNumRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeExcuteNumRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeExcuteNumRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
