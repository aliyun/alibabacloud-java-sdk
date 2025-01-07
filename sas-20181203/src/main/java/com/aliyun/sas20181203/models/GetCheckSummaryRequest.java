// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCheckSummaryRequest extends TeaModel {
    /**
     * <p>Specifies whether to return the statistics of the check items, including the number of check items supported by the system and the number of check items available to you. Default value: <strong>false</strong>. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsItemStatistic")
    public Boolean isItemStatistic;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
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
     * <p>The Alibaba Cloud account ID of the member in the resource directory.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to query the IDs of Alibaba Cloud accounts.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>000</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public String resourceDirectoryAccountId;

    /**
     * <p>The cloud service providers.</p>
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

    public GetCheckSummaryRequest setVendors(java.util.List<String> vendors) {
        this.vendors = vendors;
        return this;
    }
    public java.util.List<String> getVendors() {
        return this.vendors;
    }

}
