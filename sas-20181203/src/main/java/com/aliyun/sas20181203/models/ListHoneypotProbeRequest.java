// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListHoneypotProbeRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Pages start from page **1**. Default value: **1**.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The name of the probe.</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries to return on each page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
     * <br>
     * <p>> We recommend that you do not leave this parameter empty.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The status of the probe. Valid values:</p>
     * <br>
     * <p>*   **installed**: installed</p>
     * <p>*   **install_failed**: installation failed</p>
     * <p>*   **online**: online</p>
     * <p>*   **offline**: offline</p>
     * <p>*   **unnormal**: abnormal</p>
     * <p>*   **unprobe**: unauthorized</p>
     * <p>*   **uninstalling**: being uninstalled</p>
     * <p>*   **uninstalled**: uninstalled</p>
     * <p>*   **uninstall_failed**: uninstallation failed</p>
     * <p>*   **not_exist**: not installed</p>
     */
    @NameInMap("ProbeStatus")
    public String probeStatus;

    /**
     * <p>The type of the probe. Valid values:</p>
     * <br>
     * <p>*   **host_probe**: host probe</p>
     * <p>*   **vpc_black_hole_probe**: VPC probe</p>
     */
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
