// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMsDrmDataCellsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("DrmDataCellInfo")
    public ListMsDrmDataCellsResponseBodyDrmDataCellInfo drmDataCellInfo;

    public static ListMsDrmDataCellsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMsDrmDataCellsResponseBody self = new ListMsDrmDataCellsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMsDrmDataCellsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMsDrmDataCellsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListMsDrmDataCellsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListMsDrmDataCellsResponseBody setDrmDataCellInfo(ListMsDrmDataCellsResponseBodyDrmDataCellInfo drmDataCellInfo) {
        this.drmDataCellInfo = drmDataCellInfo;
        return this;
    }
    public ListMsDrmDataCellsResponseBodyDrmDataCellInfo getDrmDataCellInfo() {
        return this.drmDataCellInfo;
    }

    public static class ListMsDrmDataCellsResponseBodyDrmDataCellInfoCellInfos extends TeaModel {
        @NameInMap("Cell")
        public String cell;

        @NameInMap("SpecialPush")
        public Boolean specialPush;

        @NameInMap("Value")
        public String value;

        public static ListMsDrmDataCellsResponseBodyDrmDataCellInfoCellInfos build(java.util.Map<String, ?> map) throws Exception {
            ListMsDrmDataCellsResponseBodyDrmDataCellInfoCellInfos self = new ListMsDrmDataCellsResponseBodyDrmDataCellInfoCellInfos();
            return TeaModel.build(map, self);
        }

        public ListMsDrmDataCellsResponseBodyDrmDataCellInfoCellInfos setCell(String cell) {
            this.cell = cell;
            return this;
        }
        public String getCell() {
            return this.cell;
        }

        public ListMsDrmDataCellsResponseBodyDrmDataCellInfoCellInfos setSpecialPush(Boolean specialPush) {
            this.specialPush = specialPush;
            return this;
        }
        public Boolean getSpecialPush() {
            return this.specialPush;
        }

        public ListMsDrmDataCellsResponseBodyDrmDataCellInfoCellInfos setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListMsDrmDataCellsResponseBodyDrmDataCellInfo extends TeaModel {
        @NameInMap("HasSpecialCell")
        public Boolean hasSpecialCell;

        @NameInMap("CellInfos")
        public java.util.List<ListMsDrmDataCellsResponseBodyDrmDataCellInfoCellInfos> cellInfos;

        public static ListMsDrmDataCellsResponseBodyDrmDataCellInfo build(java.util.Map<String, ?> map) throws Exception {
            ListMsDrmDataCellsResponseBodyDrmDataCellInfo self = new ListMsDrmDataCellsResponseBodyDrmDataCellInfo();
            return TeaModel.build(map, self);
        }

        public ListMsDrmDataCellsResponseBodyDrmDataCellInfo setHasSpecialCell(Boolean hasSpecialCell) {
            this.hasSpecialCell = hasSpecialCell;
            return this;
        }
        public Boolean getHasSpecialCell() {
            return this.hasSpecialCell;
        }

        public ListMsDrmDataCellsResponseBodyDrmDataCellInfo setCellInfos(java.util.List<ListMsDrmDataCellsResponseBodyDrmDataCellInfoCellInfos> cellInfos) {
            this.cellInfos = cellInfos;
            return this;
        }
        public java.util.List<ListMsDrmDataCellsResponseBodyDrmDataCellInfoCellInfos> getCellInfos() {
            return this.cellInfos;
        }

    }

}
