// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListOpaClusterStrategyNewRequest extends TeaModel {
    /**
     * <p>The page number of the current page in a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The list of image names.</p>
     */
    @NameInMap("ImageName")
    public java.util.List<String> imageName;

    /**
     * <p>The list of labels.</p>
     */
    @NameInMap("Label")
    public java.util.List<String> label;

    /**
     * <p>The number of entries per page in a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The policy name.</p>
     */
    @NameInMap("StrategyName")
    public java.util.List<String> strategyName;

    public static ListOpaClusterStrategyNewRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOpaClusterStrategyNewRequest self = new ListOpaClusterStrategyNewRequest();
        return TeaModel.build(map, self);
    }

    public ListOpaClusterStrategyNewRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListOpaClusterStrategyNewRequest setImageName(java.util.List<String> imageName) {
        this.imageName = imageName;
        return this;
    }
    public java.util.List<String> getImageName() {
        return this.imageName;
    }

    public ListOpaClusterStrategyNewRequest setLabel(java.util.List<String> label) {
        this.label = label;
        return this;
    }
    public java.util.List<String> getLabel() {
        return this.label;
    }

    public ListOpaClusterStrategyNewRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOpaClusterStrategyNewRequest setStrategyName(java.util.List<String> strategyName) {
        this.strategyName = strategyName;
        return this;
    }
    public java.util.List<String> getStrategyName() {
        return this.strategyName;
    }

}
