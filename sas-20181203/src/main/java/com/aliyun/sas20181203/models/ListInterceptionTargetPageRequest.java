// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListInterceptionTargetPageRequest extends TeaModel {
    /**
     * <p>The name of the application to which the network object belongs.</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The images of the network object.</p>
     */
    @NameInMap("ImageList")
    public java.util.List<String> imageList;

    /**
     * <p>The namespace to which the network object belongs.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The number of entries to return on each page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
     * <br>
     * <p>> We recommend that you do not leave this parameter empty.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The labels specified for the network object.</p>
     */
    @NameInMap("TagList")
    public java.util.List<String> tagList;

    /**
     * <p>The name of the network object.</p>
     */
    @NameInMap("TargetName")
    public String targetName;

    /**
     * <p>The type of the network object. Valid values:</p>
     * <br>
     * <p>*   IMAGE</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    public static ListInterceptionTargetPageRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInterceptionTargetPageRequest self = new ListInterceptionTargetPageRequest();
        return TeaModel.build(map, self);
    }

    public ListInterceptionTargetPageRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListInterceptionTargetPageRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListInterceptionTargetPageRequest setImageList(java.util.List<String> imageList) {
        this.imageList = imageList;
        return this;
    }
    public java.util.List<String> getImageList() {
        return this.imageList;
    }

    public ListInterceptionTargetPageRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListInterceptionTargetPageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListInterceptionTargetPageRequest setTagList(java.util.List<String> tagList) {
        this.tagList = tagList;
        return this;
    }
    public java.util.List<String> getTagList() {
        return this.tagList;
    }

    public ListInterceptionTargetPageRequest setTargetName(String targetName) {
        this.targetName = targetName;
        return this;
    }
    public String getTargetName() {
        return this.targetName;
    }

    public ListInterceptionTargetPageRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

}
