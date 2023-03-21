// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListHoneypotPresetRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("HoneypotImageName")
    public String honeypotImageName;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("NodeName")
    public String nodeName;

    @NameInMap("PageSize")
    public Integer pageSize;

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
