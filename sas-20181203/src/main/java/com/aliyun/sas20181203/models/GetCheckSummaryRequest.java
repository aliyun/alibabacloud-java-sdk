// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCheckSummaryRequest extends TeaModel {
    /**
     * <p>Specifies whether to return check item statistics information, including the number of check items published by the system and the number of check items currently owned by the user. Default value: <strong>false</strong>. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Returns the statistics information.</li>
     * <li><strong>false</strong>: Does not return the statistics information.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsItemStatistic")
    public Boolean isItemStatistic;

    /**
     * <p>The language type for requests and responses.</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the member accounts in the resource directory.</p>
     * <blockquote>
     * <p>Invoke the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>000</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public String resourceDirectoryAccountId;

    /**
     * <p>The list of task sources.</p>
     */
    @NameInMap("TaskSources")
    public java.util.List<String> taskSources;

    /**
     * <p>The list of cloud service providers.</p>
     */
    @NameInMap("Vendors")
    public java.util.List<String> vendors;

    public static GetCheckSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCheckSummaryRequest self = new GetCheckSummaryRequest();
        return TeaModel.build(map, self);
    }

    public GetCheckSummaryRequest setIsItemStatistic(Boolean isItemStatistic) {
        this.isItemStatistic = isItemStatistic;
        return this;
    }
    public Boolean getIsItemStatistic() {
        return this.isItemStatistic;
    }

    public GetCheckSummaryRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public GetCheckSummaryRequest setResourceDirectoryAccountId(String resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public String getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public GetCheckSummaryRequest setTaskSources(java.util.List<String> taskSources) {
        this.taskSources = taskSources;
        return this;
    }
    public java.util.List<String> getTaskSources() {
        return this.taskSources;
    }

    public GetCheckSummaryRequest setVendors(java.util.List<String> vendors) {
        this.vendors = vendors;
        return this;
    }
    public java.util.List<String> getVendors() {
        return this.vendors;
    }

}
