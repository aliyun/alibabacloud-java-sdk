// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class AppMaterialDirectory extends TeaModel {
    /**
     * <p>The business ID of the application instance.</p>
     * 
     * <strong>example:</strong>
     * <p>WD20250814102215000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>The list of subfolders.</p>
     */
    @NameInMap("Children")
    public java.util.List<AppMaterialDirectory> children;

    /**
     * <p>The folder ID.</p>
     * 
     * <strong>example:</strong>
     * <p>WS20260206134746000001-system</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The name.</p>
     * 
     * <strong>example:</strong>
     * <p>图片管理</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The sort number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SortNum")
    public String sortNum;

    /**
     * <p>The folder type.</p>
     * 
     * <strong>example:</strong>
     * <p>CUSTOM</p>
     */
    @NameInMap("Type")
    public String type;

    public static AppMaterialDirectory build(java.util.Map<String, ?> map) throws Exception {
        AppMaterialDirectory self = new AppMaterialDirectory();
        return TeaModel.build(map, self);
    }

    public AppMaterialDirectory setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public AppMaterialDirectory setChildren(java.util.List<AppMaterialDirectory> children) {
        this.children = children;
        return this;
    }
    public java.util.List<AppMaterialDirectory> getChildren() {
        return this.children;
    }

    public AppMaterialDirectory setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public AppMaterialDirectory setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AppMaterialDirectory setSortNum(String sortNum) {
        this.sortNum = sortNum;
        return this;
    }
    public String getSortNum() {
        return this.sortNum;
    }

    public AppMaterialDirectory setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
