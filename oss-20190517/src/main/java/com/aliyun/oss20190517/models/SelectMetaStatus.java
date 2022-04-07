// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class SelectMetaStatus extends TeaModel {
    // description
    @NameInMap("ColsCount")
    public Long colsCount;

    // description
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // description
    @NameInMap("Offset")
    public Long offset;

    // description
    @NameInMap("RowsCount")
    public Long rowsCount;

    // description
    @NameInMap("SplitsCount")
    public Long splitsCount;

    // description
    @NameInMap("Status")
    public Long status;

    // description
    @NameInMap("TotalScannedBytes")
    public Long totalScannedBytes;

    public static SelectMetaStatus build(java.util.Map<String, ?> map) throws Exception {
        SelectMetaStatus self = new SelectMetaStatus();
        return TeaModel.build(map, self);
    }

    public SelectMetaStatus setColsCount(Long colsCount) {
        this.colsCount = colsCount;
        return this;
    }
    public Long getColsCount() {
        return this.colsCount;
    }

    public SelectMetaStatus setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public SelectMetaStatus setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

    public SelectMetaStatus setRowsCount(Long rowsCount) {
        this.rowsCount = rowsCount;
        return this;
    }
    public Long getRowsCount() {
        return this.rowsCount;
    }

    public SelectMetaStatus setSplitsCount(Long splitsCount) {
        this.splitsCount = splitsCount;
        return this;
    }
    public Long getSplitsCount() {
        return this.splitsCount;
    }

    public SelectMetaStatus setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public SelectMetaStatus setTotalScannedBytes(Long totalScannedBytes) {
        this.totalScannedBytes = totalScannedBytes;
        return this;
    }
    public Long getTotalScannedBytes() {
        return this.totalScannedBytes;
    }

}
