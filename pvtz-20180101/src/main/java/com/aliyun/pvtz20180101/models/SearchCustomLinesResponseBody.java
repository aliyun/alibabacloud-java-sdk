// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class SearchCustomLinesResponseBody extends TeaModel {
    /**
     * <p>The custom lines.</p>
     */
    @NameInMap("CustomLines")
    public SearchCustomLinesResponseBodyCustomLines customLines;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: <strong>1 to 100</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>46973D4C-E3E4-4ABA-9190-9A9DE406C7E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalItems")
    public Integer totalItems;

    /**
     * <p>The total number of returned pages.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalPages")
    public Integer totalPages;

    public static SearchCustomLinesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchCustomLinesResponseBody self = new SearchCustomLinesResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchCustomLinesResponseBody setCustomLines(SearchCustomLinesResponseBodyCustomLines customLines) {
        this.customLines = customLines;
        return this;
    }
    public SearchCustomLinesResponseBodyCustomLines getCustomLines() {
        return this.customLines;
    }

    public SearchCustomLinesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchCustomLinesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchCustomLinesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchCustomLinesResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public SearchCustomLinesResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static class SearchCustomLinesResponseBodyCustomLinesCustomLineIpv4s extends TeaModel {
        @NameInMap("Ipv4")
        public java.util.List<String> ipv4;

        public static SearchCustomLinesResponseBodyCustomLinesCustomLineIpv4s build(java.util.Map<String, ?> map) throws Exception {
            SearchCustomLinesResponseBodyCustomLinesCustomLineIpv4s self = new SearchCustomLinesResponseBodyCustomLinesCustomLineIpv4s();
            return TeaModel.build(map, self);
        }

        public SearchCustomLinesResponseBodyCustomLinesCustomLineIpv4s setIpv4(java.util.List<String> ipv4) {
            this.ipv4 = ipv4;
            return this;
        }
        public java.util.List<String> getIpv4() {
            return this.ipv4;
        }

    }

    public static class SearchCustomLinesResponseBodyCustomLinesCustomLine extends TeaModel {
        /**
         * <p>The time when the custom line was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-12-27 18:16:38</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the custom line was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1671174074000</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <p>The ID of the creator for the custom line.</p>
         * 
         * <strong>example:</strong>
         * <p>1851321989648462</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The creator type. Valid values:</p>
         * <ul>
         * <li>CUSTOM: Alibaba Cloud account</li>
         * <li>SUB: RAM user</li>
         * <li>STS: assumed role that obtains the Security Token Service (STS) token of a RAM role</li>
         * <li>OTHER: other types</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUB</p>
         */
        @NameInMap("CreatorSubType")
        public String creatorSubType;

        /**
         * <p>The role of the creator for the custom line. Valid values:</p>
         * <ul>
         * <li>USER: user</li>
         * <li>SYSTEM: system</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        @NameInMap("CreatorType")
        public String creatorType;

        /**
         * <p>The IPv4 CIDR blocks.</p>
         */
        @NameInMap("Ipv4s")
        public SearchCustomLinesResponseBodyCustomLinesCustomLineIpv4s ipv4s;

        /**
         * <p>The unique ID of the custom line.</p>
         * 
         * <strong>example:</strong>
         * <p>11730</p>
         */
        @NameInMap("LineId")
        public String lineId;

        /**
         * <p>The name of the custom line.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The time when the custom line was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-06-14 14:04:08</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The time when the custom line was updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1672136518000</p>
         */
        @NameInMap("UpdateTimestamp")
        public Long updateTimestamp;

        public static SearchCustomLinesResponseBodyCustomLinesCustomLine build(java.util.Map<String, ?> map) throws Exception {
            SearchCustomLinesResponseBodyCustomLinesCustomLine self = new SearchCustomLinesResponseBodyCustomLinesCustomLine();
            return TeaModel.build(map, self);
        }

        public SearchCustomLinesResponseBodyCustomLinesCustomLine setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public SearchCustomLinesResponseBodyCustomLinesCustomLine setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public SearchCustomLinesResponseBodyCustomLinesCustomLine setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public SearchCustomLinesResponseBodyCustomLinesCustomLine setCreatorSubType(String creatorSubType) {
            this.creatorSubType = creatorSubType;
            return this;
        }
        public String getCreatorSubType() {
            return this.creatorSubType;
        }

        public SearchCustomLinesResponseBodyCustomLinesCustomLine setCreatorType(String creatorType) {
            this.creatorType = creatorType;
            return this;
        }
        public String getCreatorType() {
            return this.creatorType;
        }

        public SearchCustomLinesResponseBodyCustomLinesCustomLine setIpv4s(SearchCustomLinesResponseBodyCustomLinesCustomLineIpv4s ipv4s) {
            this.ipv4s = ipv4s;
            return this;
        }
        public SearchCustomLinesResponseBodyCustomLinesCustomLineIpv4s getIpv4s() {
            return this.ipv4s;
        }

        public SearchCustomLinesResponseBodyCustomLinesCustomLine setLineId(String lineId) {
            this.lineId = lineId;
            return this;
        }
        public String getLineId() {
            return this.lineId;
        }

        public SearchCustomLinesResponseBodyCustomLinesCustomLine setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SearchCustomLinesResponseBodyCustomLinesCustomLine setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public SearchCustomLinesResponseBodyCustomLinesCustomLine setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

    }

    public static class SearchCustomLinesResponseBodyCustomLines extends TeaModel {
        @NameInMap("CustomLine")
        public java.util.List<SearchCustomLinesResponseBodyCustomLinesCustomLine> customLine;

        public static SearchCustomLinesResponseBodyCustomLines build(java.util.Map<String, ?> map) throws Exception {
            SearchCustomLinesResponseBodyCustomLines self = new SearchCustomLinesResponseBodyCustomLines();
            return TeaModel.build(map, self);
        }

        public SearchCustomLinesResponseBodyCustomLines setCustomLine(java.util.List<SearchCustomLinesResponseBodyCustomLinesCustomLine> customLine) {
            this.customLine = customLine;
            return this;
        }
        public java.util.List<SearchCustomLinesResponseBodyCustomLinesCustomLine> getCustomLine() {
            return this.customLine;
        }

    }

}
