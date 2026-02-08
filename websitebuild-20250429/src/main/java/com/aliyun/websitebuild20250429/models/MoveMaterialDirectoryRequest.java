// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class MoveMaterialDirectoryRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WD20250703155602000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>68157a0a-769a-4364-bbdc-a0e2cf3d5ad</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>58157a0a-769a-4364-bbdc-a0e2cf3d5a2</p>
     */
    @NameInMap("ParentDirectoryId")
    public String parentDirectoryId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SortNum")
    public Integer sortNum;

    public static MoveMaterialDirectoryRequest build(java.util.Map<String, ?> map) throws Exception {
        MoveMaterialDirectoryRequest self = new MoveMaterialDirectoryRequest();
        return TeaModel.build(map, self);
    }

    public MoveMaterialDirectoryRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public MoveMaterialDirectoryRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public MoveMaterialDirectoryRequest setParentDirectoryId(String parentDirectoryId) {
        this.parentDirectoryId = parentDirectoryId;
        return this;
    }
    public String getParentDirectoryId() {
        return this.parentDirectoryId;
    }

    public MoveMaterialDirectoryRequest setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
        return this;
    }
    public Integer getSortNum() {
        return this.sortNum;
    }

}
