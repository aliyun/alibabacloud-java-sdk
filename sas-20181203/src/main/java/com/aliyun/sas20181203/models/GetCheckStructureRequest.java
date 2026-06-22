// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCheckStructureRequest extends TeaModel {
    /**
     * <p>The page number of the current page in a paging query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The language type for requests and responses. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The maximum number of entries per page in a paging query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region where the asset resides. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: China</li>
     * <li>ap-southeast-1: outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The list of task sources.</p>
     */
    @NameInMap("TaskSources")
    public java.util.List<String> taskSources;

    public static GetCheckStructureRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCheckStructureRequest self = new GetCheckStructureRequest();
        return TeaModel.build(map, self);
    }

    public GetCheckStructureRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetCheckStructureRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public GetCheckStructureRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetCheckStructureRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetCheckStructureRequest setTaskSources(java.util.List<String> taskSources) {
        this.taskSources = taskSources;
        return this;
    }
    public java.util.List<String> getTaskSources() {
        return this.taskSources;
    }

}
