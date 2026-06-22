// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListHoneypotProbeRequest extends TeaModel {
    /**
     * <p>The page number of the page to return. Minimum value: <strong>1</strong>. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The name of the probe.</p>
     * 
     * <strong>example:</strong>
     * <p>probe-test</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The language of the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The maximum number of entries to return on each page in a paged query. Default value: 20. If you leave this parameter empty, 20 entries are returned per page during paging.</p>
     * <blockquote>
     * <p>Do not leave PageSize empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The probe status. Valid values:</p>
     * <ul>
     * <li><strong>installed</strong>: Installation succeeded.</li>
     * <li><strong>install_failed</strong>: Installation failed.</li>
     * <li><strong>online</strong>: Normal.</li>
     * <li><strong>offline</strong>: Offline.</li>
     * <li><strong>unnormal</strong>: Service exception.</li>
     * <li><strong>unprobe</strong>: Unauthorized.</li>
     * <li><strong>uninstalling</strong>: Uninstalling.</li>
     * <li><strong>uninstalled</strong>: Uninstallation succeeded.</li>
     * <li><strong>uninstall_failed</strong>: Uninstallation failed.</li>
     * <li><strong>not_exist</strong>: Not installed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>online</p>
     */
    @NameInMap("ProbeStatus")
    public String probeStatus;

    /**
     * <p>The probe type. Valid values:</p>
     * <ul>
     * <li><strong>host_probe</strong>: host probe</li>
     * <li><strong>vpc_black_hole_probe</strong>: VPC blackhole probe.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>host_probe</p>
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
