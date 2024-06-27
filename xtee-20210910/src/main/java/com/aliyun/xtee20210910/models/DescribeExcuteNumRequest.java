// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeExcuteNumRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Degree")
    public String degree;

    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("SourceIp")
    public String sourceIp;

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
