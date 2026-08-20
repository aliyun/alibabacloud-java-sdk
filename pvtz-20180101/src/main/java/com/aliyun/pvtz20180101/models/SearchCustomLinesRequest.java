// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class SearchCustomLinesRequest extends TeaModel {
    /**
     * <p>The end of the creation time range. This value is a UNIX timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1672136518234</p>
     */
    @NameInMap("CreateTimestampEnd")
    public Long createTimestampEnd;

    /**
     * <p>The start of the creation time range. This value is a UNIX timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1672136518123</p>
     */
    @NameInMap("CreateTimestampStart")
    public Long createTimestampStart;

    /**
     * <p>The list of creator IDs.</p>
     */
    @NameInMap("Creator")
    public java.util.List<String> creator;

    /**
     * <p>The IPv4 address.</p>
     * 
     * <strong>example:</strong>
     * <p>1.1.1.1</p>
     */
    @NameInMap("Ipv4")
    public String ipv4;

    /**
     * <p>The language.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The name of the custom ACL.</p>
     * 
     * <strong>example:</strong>
     * <p>Test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The page number. The value starts from <strong>1</strong>. The default value is <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page for a paged query. The maximum value is <strong>100</strong>. The default value is <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The end of the update time range. This value is a UNIX timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1672136518000</p>
     */
    @NameInMap("UpdateTimestampEnd")
    public Long updateTimestampEnd;

    /**
     * <p>The start of the update time range. This value is a UNIX timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1672136515000</p>
     */
    @NameInMap("UpdateTimestampStart")
    public Long updateTimestampStart;

    public static SearchCustomLinesRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchCustomLinesRequest self = new SearchCustomLinesRequest();
        return TeaModel.build(map, self);
    }

    public SearchCustomLinesRequest setCreateTimestampEnd(Long createTimestampEnd) {
        this.createTimestampEnd = createTimestampEnd;
        return this;
    }
    public Long getCreateTimestampEnd() {
        return this.createTimestampEnd;
    }

    public SearchCustomLinesRequest setCreateTimestampStart(Long createTimestampStart) {
        this.createTimestampStart = createTimestampStart;
        return this;
    }
    public Long getCreateTimestampStart() {
        return this.createTimestampStart;
    }

    public SearchCustomLinesRequest setCreator(java.util.List<String> creator) {
        this.creator = creator;
        return this;
    }
    public java.util.List<String> getCreator() {
        return this.creator;
    }

    public SearchCustomLinesRequest setIpv4(String ipv4) {
        this.ipv4 = ipv4;
        return this;
    }
    public String getIpv4() {
        return this.ipv4;
    }

    public SearchCustomLinesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SearchCustomLinesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SearchCustomLinesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchCustomLinesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchCustomLinesRequest setUpdateTimestampEnd(Long updateTimestampEnd) {
        this.updateTimestampEnd = updateTimestampEnd;
        return this;
    }
    public Long getUpdateTimestampEnd() {
        return this.updateTimestampEnd;
    }

    public SearchCustomLinesRequest setUpdateTimestampStart(Long updateTimestampStart) {
        this.updateTimestampStart = updateTimestampStart;
        return this;
    }
    public Long getUpdateTimestampStart() {
        return this.updateTimestampStart;
    }

}
