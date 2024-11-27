// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ImportCalendarRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxljob-b6ec1xxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;month&quot;:1,&quot;days&quot;:[3,4,5,6,9,10,11,12,13,16,17,18,19,20,28,29,30,31]},{&quot;month&quot;:2,&quot;days&quot;:[1,2,3,6,7,8,9,10,13,14,15,16,17,20,21,22,23,24,27,28]},{&quot;month&quot;:3,&quot;days&quot;:[1,2,3,6,7,8,9,10,13,14,15,16,17,20,21,22,23,24,27,28,29,30,31]},{&quot;month&quot;:4,&quot;days&quot;:[3,4,6,7,10,11,12,13,14,17,18,19,20,21,23,24,25,26,27,28]},{&quot;month&quot;:5,&quot;days&quot;:[4,5,6,8,9,10,11,12,15,16,17,18,19,22,23,24,25,26,29,30,31]},{&quot;month&quot;:6,&quot;days&quot;:[1,2,5,6,7,8,9,12,13,14,15,16,19,20,21,25,26,27,28,29,30]},{&quot;month&quot;:7,&quot;days&quot;:[3,4,5,6,7,10,11,12,13,14,17,18,19,20,21,24,25,26,27,28,31]},{&quot;month&quot;:8,&quot;days&quot;:[1,2,3,4,7,8,9,10,11,14,15,16,17,18,21,22,23,24,25,28,29,30,31]},{&quot;month&quot;:9,&quot;days&quot;:[1,4,5,6,7,8,11,12,13,14,15,18,19,20,21,22,25,26,27,28]},{&quot;month&quot;:10,&quot;days&quot;:[7,8,9,10,11,12,13,16,17,18,19,20,23,24,25,26,27,30,31]},{&quot;month&quot;:11,&quot;days&quot;:[1,2,3,6,7,8,9,10,13,14,15,16,17,20,21,22,23,24,27,28,29,30]},{&quot;month&quot;:12,&quot;days&quot;:[1,4,5,6,7,8,11,12,13,14,15,18,19,20,21,22,25,26,27,28,29]}]</p>
     */
    @NameInMap("Months")
    public String months;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>workday</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2024</p>
     */
    @NameInMap("Year")
    public Integer year;

    public static ImportCalendarRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportCalendarRequest self = new ImportCalendarRequest();
        return TeaModel.build(map, self);
    }

    public ImportCalendarRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ImportCalendarRequest setMonths(String months) {
        this.months = months;
        return this;
    }
    public String getMonths() {
        return this.months;
    }

    public ImportCalendarRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ImportCalendarRequest setYear(Integer year) {
        this.year = year;
        return this;
    }
    public Integer getYear() {
        return this.year;
    }

}
