// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListHoneypotPresetRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The name of the honeypot image.</p>
     * 
     * <strong>example:</strong>
     * <p>ruoyi</p>
     */
    @NameInMap("HoneypotImageName")
    public String honeypotImageName;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
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
     * <p>The ID of the management node.</p>
     * 
     * <strong>example:</strong>
     * <p>d892b4fe-af0d-4486-ab2a-8a518045****</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The name of the management node.</p>
     * 
     * <strong>example:</strong>
     * <p>Node1</p>
     */
    @NameInMap("NodeName")
    public String nodeName;

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
     * <p>The custom name of the honeypot template.</p>
     * 
     * <strong>example:</strong>
     * <p>mx-rouyi</p>
     */
    @NameInMap("PresetName")
    public String presetName;

    public static ListHoneypotPresetRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHoneypotPresetRequest self = new ListHoneypotPresetRequest();
        return TeaModel.build(map, self);
    }

    public ListHoneypotPresetRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListHoneypotPresetRequest setHoneypotImageName(String honeypotImageName) {
        this.honeypotImageName = honeypotImageName;
        return this;
    }
    public String getHoneypotImageName() {
        return this.honeypotImageName;
    }

    public ListHoneypotPresetRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListHoneypotPresetRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public ListHoneypotPresetRequest setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

    public ListHoneypotPresetRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListHoneypotPresetRequest setPresetName(String presetName) {
        this.presetName = presetName;
        return this;
    }
    public String getPresetName() {
        return this.presetName;
    }

}
