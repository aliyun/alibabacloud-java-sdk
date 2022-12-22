// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListIpsecServerLogsRequest extends TeaModel {
    @NameInMap("From")
    public Integer from;

    @NameInMap("IpsecServerId")
    public String ipsecServerId;

    @NameInMap("MinutePeriod")
    public Integer minutePeriod;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("To")
    public Integer to;

    public static ListIpsecServerLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIpsecServerLogsRequest self = new ListIpsecServerLogsRequest();
        return TeaModel.build(map, self);
    }

    public ListIpsecServerLogsRequest setFrom(Integer from) {
        this.from = from;
        return this;
    }
    public Integer getFrom() {
        return this.from;
    }

    public ListIpsecServerLogsRequest setIpsecServerId(String ipsecServerId) {
        this.ipsecServerId = ipsecServerId;
        return this;
    }
    public String getIpsecServerId() {
        return this.ipsecServerId;
    }

    public ListIpsecServerLogsRequest setMinutePeriod(Integer minutePeriod) {
        this.minutePeriod = minutePeriod;
        return this;
    }
    public Integer getMinutePeriod() {
        return this.minutePeriod;
    }

    public ListIpsecServerLogsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListIpsecServerLogsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListIpsecServerLogsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListIpsecServerLogsRequest setTo(Integer to) {
        this.to = to;
        return this;
    }
    public Integer getTo() {
        return this.to;
    }

}
