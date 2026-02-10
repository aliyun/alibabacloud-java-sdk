// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class ListMultimodalFineTuneDatasetRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-2ze454l20me07****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <strong>example:</strong>
     * <p>dataset1</p>
     */
    @NameInMap("InputField")
    public String inputField;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListMultimodalFineTuneDatasetRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMultimodalFineTuneDatasetRequest self = new ListMultimodalFineTuneDatasetRequest();
        return TeaModel.build(map, self);
    }

    public ListMultimodalFineTuneDatasetRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ListMultimodalFineTuneDatasetRequest setInputField(String inputField) {
        this.inputField = inputField;
        return this;
    }
    public String getInputField() {
        return this.inputField;
    }

    public ListMultimodalFineTuneDatasetRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListMultimodalFineTuneDatasetRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
