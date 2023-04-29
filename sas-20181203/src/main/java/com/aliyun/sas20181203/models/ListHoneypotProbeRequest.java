// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListHoneypotProbeRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProbeStatus")
    public String probeStatus;

    @NameInMap("ProbeType")
    public String probeType;

    public static ListHoneypotProbeRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHoneypotProbeRequest self = new ListHoneypotProbeRequest();
        return TeaModel.build(map, self);
    }

    public ListHoneypotProbeRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListHoneypotProbeRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public ListHoneypotProbeRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListHoneypotProbeRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListHoneypotProbeRequest setProbeStatus(String probeStatus) {
        this.probeStatus = probeStatus;
        return this;
    }
    public String getProbeStatus() {
        return this.probeStatus;
    }

    public ListHoneypotProbeRequest setProbeType(String probeType) {
        this.probeType = probeType;
        return this;
    }
    public String getProbeType() {
        return this.probeType;
    }

}
