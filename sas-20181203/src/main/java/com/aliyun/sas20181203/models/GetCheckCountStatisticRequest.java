// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCheckCountStatisticRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The type of the statistics. Valid values:</p>
     * <ul>
     * <li><strong>user</strong>: the top five users that are granted excessive permissions.</li>
     * <li><strong>role</strong>: the top five roles that are granted excessive permissions.</li>
     * <li><strong>instance</strong>: the top five cloud services on which risks are detected.</li>
     * <li><strong>host</strong>: the top five servers on which baseline risks are detected.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>instance</p>
     */
    @NameInMap("StatisticType")
    public String statisticType;

    /**
     * <p>Task source.</p>
     */
    @NameInMap("TaskSources")
    public java.util.List<String> taskSources;

    /**
     * <p>The cloud service providers.</p>
     */
    @NameInMap("Vendors")
    public java.util.List<String> vendors;

    public static GetCheckCountStatisticRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCheckCountStatisticRequest self = new GetCheckCountStatisticRequest();
        return TeaModel.build(map, self);
    }

    public GetCheckCountStatisticRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public GetCheckCountStatisticRequest setStatisticType(String statisticType) {
        this.statisticType = statisticType;
        return this;
    }
    public String getStatisticType() {
        return this.statisticType;
    }

    public GetCheckCountStatisticRequest setTaskSources(java.util.List<String> taskSources) {
        this.taskSources = taskSources;
        return this;
    }
    public java.util.List<String> getTaskSources() {
        return this.taskSources;
    }

    public GetCheckCountStatisticRequest setVendors(java.util.List<String> vendors) {
        this.vendors = vendors;
        return this;
    }
    public java.util.List<String> getVendors() {
        return this.vendors;
    }

}
