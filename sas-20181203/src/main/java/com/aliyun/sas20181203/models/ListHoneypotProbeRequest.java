// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListHoneypotProbeRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Pages start from page <strong>1</strong>. Default value: <strong>1</strong>.</p>
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
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries to return on each page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
     * <blockquote>
     * <p>We recommend that you do not leave this parameter empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The status of the probe. Valid values:</p>
     * <ul>
     * <li><strong>installed</strong>: installed</li>
     * <li><strong>install_failed</strong>: installation failed</li>
     * <li><strong>online</strong>: online</li>
     * <li><strong>offline</strong>: offline</li>
     * <li><strong>unnormal</strong>: abnormal</li>
     * <li><strong>unprobe</strong>: unauthorized</li>
     * <li><strong>uninstalling</strong>: being uninstalled</li>
     * <li><strong>uninstalled</strong>: uninstalled</li>
     * <li><strong>uninstall_failed</strong>: uninstallation failed</li>
     * <li><strong>not_exist</strong>: not installed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>online</p>
     */
    @NameInMap("ProbeStatus")
    public String probeStatus;

    /**
     * <p>The type of the probe. Valid values:</p>
     * <ul>
     * <li><strong>host_probe</strong>: host probe</li>
     * <li><strong>vpc_black_hole_probe</strong>: VPC probe</li>
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
