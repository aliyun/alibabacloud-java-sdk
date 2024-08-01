// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeCustomLinesResponseBody extends TeaModel {
    @NameInMap("CustomLines")
    public DescribeCustomLinesResponseBodyCustomLines customLines;

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

    /**
     * <strong>example:</strong>
     * <p>AF7D4DCE-0776-47F2-A9B2-6FB85A87AA60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalItems")
    public Integer totalItems;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalPages")
    public Integer totalPages;

    public static DescribeCustomLinesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomLinesResponseBody self = new DescribeCustomLinesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustomLinesResponseBody setCustomLines(DescribeCustomLinesResponseBodyCustomLines customLines) {
        this.customLines = customLines;
        return this;
    }
    public DescribeCustomLinesResponseBodyCustomLines getCustomLines() {
        return this.customLines;
    }

    public DescribeCustomLinesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCustomLinesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCustomLinesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCustomLinesResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public DescribeCustomLinesResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static class DescribeCustomLinesResponseBodyCustomLinesCustomLineIpv4s extends TeaModel {
        @NameInMap("Ipv4")
        public java.util.List<String> ipv4;

        public static DescribeCustomLinesResponseBodyCustomLinesCustomLineIpv4s build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomLinesResponseBodyCustomLinesCustomLineIpv4s self = new DescribeCustomLinesResponseBodyCustomLinesCustomLineIpv4s();
            return TeaModel.build(map, self);
        }

        public DescribeCustomLinesResponseBodyCustomLinesCustomLineIpv4s setIpv4(java.util.List<String> ipv4) {
            this.ipv4 = ipv4;
            return this;
        }
        public java.util.List<String> getIpv4() {
            return this.ipv4;
        }

    }

    public static class DescribeCustomLinesResponseBodyCustomLinesCustomLine extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2022-03-25T08:07Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>1671174074000</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <strong>example:</strong>
         * <p>21312421</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <strong>example:</strong>
         * <p>SUB</p>
         */
        @NameInMap("CreatorSubType")
        public String creatorSubType;

        /**
         * <strong>example:</strong>
         * <p>USER</p>
         */
        @NameInMap("CreatorType")
        public String creatorType;

        @NameInMap("Ipv4s")
        public DescribeCustomLinesResponseBodyCustomLinesCustomLineIpv4s ipv4s;

        /**
         * <strong>example:</strong>
         * <p>160002</p>
         */
        @NameInMap("LineId")
        public String lineId;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>2020-08-24T16:08Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <strong>example:</strong>
         * <p>1681879029000</p>
         */
        @NameInMap("UpdateTimestamp")
        public Long updateTimestamp;

        public static DescribeCustomLinesResponseBodyCustomLinesCustomLine build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomLinesResponseBodyCustomLinesCustomLine self = new DescribeCustomLinesResponseBodyCustomLinesCustomLine();
            return TeaModel.build(map, self);
        }

        public DescribeCustomLinesResponseBodyCustomLinesCustomLine setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeCustomLinesResponseBodyCustomLinesCustomLine setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribeCustomLinesResponseBodyCustomLinesCustomLine setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public DescribeCustomLinesResponseBodyCustomLinesCustomLine setCreatorSubType(String creatorSubType) {
            this.creatorSubType = creatorSubType;
            return this;
        }
        public String getCreatorSubType() {
            return this.creatorSubType;
        }

        public DescribeCustomLinesResponseBodyCustomLinesCustomLine setCreatorType(String creatorType) {
            this.creatorType = creatorType;
            return this;
        }
        public String getCreatorType() {
            return this.creatorType;
        }

        public DescribeCustomLinesResponseBodyCustomLinesCustomLine setIpv4s(DescribeCustomLinesResponseBodyCustomLinesCustomLineIpv4s ipv4s) {
            this.ipv4s = ipv4s;
            return this;
        }
        public DescribeCustomLinesResponseBodyCustomLinesCustomLineIpv4s getIpv4s() {
            return this.ipv4s;
        }

        public DescribeCustomLinesResponseBodyCustomLinesCustomLine setLineId(String lineId) {
            this.lineId = lineId;
            return this;
        }
        public String getLineId() {
            return this.lineId;
        }

        public DescribeCustomLinesResponseBodyCustomLinesCustomLine setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCustomLinesResponseBodyCustomLinesCustomLine setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeCustomLinesResponseBodyCustomLinesCustomLine setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

    }

    public static class DescribeCustomLinesResponseBodyCustomLines extends TeaModel {
        @NameInMap("CustomLine")
        public java.util.List<DescribeCustomLinesResponseBodyCustomLinesCustomLine> customLine;

        public static DescribeCustomLinesResponseBodyCustomLines build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomLinesResponseBodyCustomLines self = new DescribeCustomLinesResponseBodyCustomLines();
            return TeaModel.build(map, self);
        }

        public DescribeCustomLinesResponseBodyCustomLines setCustomLine(java.util.List<DescribeCustomLinesResponseBodyCustomLinesCustomLine> customLine) {
            this.customLine = customLine;
            return this;
        }
        public java.util.List<DescribeCustomLinesResponseBodyCustomLinesCustomLine> getCustomLine() {
            return this.customLine;
        }

    }

}
