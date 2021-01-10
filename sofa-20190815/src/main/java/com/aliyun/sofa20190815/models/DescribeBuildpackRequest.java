// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeBuildpackRequest extends TeaModel {
    @NameInMap("BuildCommand")
    public String buildCommand;

    @NameInMap("CreationTimeFrom")
    public String creationTimeFrom;

    @NameInMap("CreationTimeTo")
    public String creationTimeTo;

    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("Descend")
    public Boolean descend;

    @NameInMap("FullVersion")
    public String fullVersion;

    @NameInMap("IsProcessed")
    public Boolean isProcessed;

    @NameInMap("ModificationTimeFrom")
    public String modificationTimeFrom;

    @NameInMap("ModificationTimeTo")
    public String modificationTimeTo;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("PublicationTimeFrom")
    public String publicationTimeFrom;

    @NameInMap("PublicationTimeTo")
    public String publicationTimeTo;

    @NameInMap("SortField")
    public String sortField;

    @NameInMap("CreatedFromsRepeatList")
    public java.util.List<String> createdFromsRepeatList;

    @NameInMap("CreatorIdsRepeatList")
    public java.util.List<String> creatorIdsRepeatList;

    @NameInMap("IdsRepeatList")
    public java.util.List<String> idsRepeatList;

    @NameInMap("PublisherIdsRepeatList")
    public java.util.List<String> publisherIdsRepeatList;

    @NameInMap("ScopesRepeatList")
    public java.util.List<String> scopesRepeatList;

    @NameInMap("StatusesRepeatList")
    public java.util.List<String> statusesRepeatList;

    @NameInMap("SupportedOsIdsRepeatList")
    public java.util.List<Integer> supportedOsIdsRepeatList;

    @NameInMap("SupportedRegionIdsRepeatList")
    public java.util.List<String> supportedRegionIdsRepeatList;

    @NameInMap("TechstackIdsRepeatList")
    public java.util.List<Integer> techstackIdsRepeatList;

    @NameInMap("TechstackNamesRepeatList")
    public java.util.List<String> techstackNamesRepeatList;

    public static DescribeBuildpackRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBuildpackRequest self = new DescribeBuildpackRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBuildpackRequest setBuildCommand(String buildCommand) {
        this.buildCommand = buildCommand;
        return this;
    }
    public String getBuildCommand() {
        return this.buildCommand;
    }

    public DescribeBuildpackRequest setCreationTimeFrom(String creationTimeFrom) {
        this.creationTimeFrom = creationTimeFrom;
        return this;
    }
    public String getCreationTimeFrom() {
        return this.creationTimeFrom;
    }

    public DescribeBuildpackRequest setCreationTimeTo(String creationTimeTo) {
        this.creationTimeTo = creationTimeTo;
        return this;
    }
    public String getCreationTimeTo() {
        return this.creationTimeTo;
    }

    public DescribeBuildpackRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public DescribeBuildpackRequest setDescend(Boolean descend) {
        this.descend = descend;
        return this;
    }
    public Boolean getDescend() {
        return this.descend;
    }

    public DescribeBuildpackRequest setFullVersion(String fullVersion) {
        this.fullVersion = fullVersion;
        return this;
    }
    public String getFullVersion() {
        return this.fullVersion;
    }

    public DescribeBuildpackRequest setIsProcessed(Boolean isProcessed) {
        this.isProcessed = isProcessed;
        return this;
    }
    public Boolean getIsProcessed() {
        return this.isProcessed;
    }

    public DescribeBuildpackRequest setModificationTimeFrom(String modificationTimeFrom) {
        this.modificationTimeFrom = modificationTimeFrom;
        return this;
    }
    public String getModificationTimeFrom() {
        return this.modificationTimeFrom;
    }

    public DescribeBuildpackRequest setModificationTimeTo(String modificationTimeTo) {
        this.modificationTimeTo = modificationTimeTo;
        return this;
    }
    public String getModificationTimeTo() {
        return this.modificationTimeTo;
    }

    public DescribeBuildpackRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeBuildpackRequest setPublicationTimeFrom(String publicationTimeFrom) {
        this.publicationTimeFrom = publicationTimeFrom;
        return this;
    }
    public String getPublicationTimeFrom() {
        return this.publicationTimeFrom;
    }

    public DescribeBuildpackRequest setPublicationTimeTo(String publicationTimeTo) {
        this.publicationTimeTo = publicationTimeTo;
        return this;
    }
    public String getPublicationTimeTo() {
        return this.publicationTimeTo;
    }

    public DescribeBuildpackRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

    public DescribeBuildpackRequest setCreatedFromsRepeatList(java.util.List<String> createdFromsRepeatList) {
        this.createdFromsRepeatList = createdFromsRepeatList;
        return this;
    }
    public java.util.List<String> getCreatedFromsRepeatList() {
        return this.createdFromsRepeatList;
    }

    public DescribeBuildpackRequest setCreatorIdsRepeatList(java.util.List<String> creatorIdsRepeatList) {
        this.creatorIdsRepeatList = creatorIdsRepeatList;
        return this;
    }
    public java.util.List<String> getCreatorIdsRepeatList() {
        return this.creatorIdsRepeatList;
    }

    public DescribeBuildpackRequest setIdsRepeatList(java.util.List<String> idsRepeatList) {
        this.idsRepeatList = idsRepeatList;
        return this;
    }
    public java.util.List<String> getIdsRepeatList() {
        return this.idsRepeatList;
    }

    public DescribeBuildpackRequest setPublisherIdsRepeatList(java.util.List<String> publisherIdsRepeatList) {
        this.publisherIdsRepeatList = publisherIdsRepeatList;
        return this;
    }
    public java.util.List<String> getPublisherIdsRepeatList() {
        return this.publisherIdsRepeatList;
    }

    public DescribeBuildpackRequest setScopesRepeatList(java.util.List<String> scopesRepeatList) {
        this.scopesRepeatList = scopesRepeatList;
        return this;
    }
    public java.util.List<String> getScopesRepeatList() {
        return this.scopesRepeatList;
    }

    public DescribeBuildpackRequest setStatusesRepeatList(java.util.List<String> statusesRepeatList) {
        this.statusesRepeatList = statusesRepeatList;
        return this;
    }
    public java.util.List<String> getStatusesRepeatList() {
        return this.statusesRepeatList;
    }

    public DescribeBuildpackRequest setSupportedOsIdsRepeatList(java.util.List<Integer> supportedOsIdsRepeatList) {
        this.supportedOsIdsRepeatList = supportedOsIdsRepeatList;
        return this;
    }
    public java.util.List<Integer> getSupportedOsIdsRepeatList() {
        return this.supportedOsIdsRepeatList;
    }

    public DescribeBuildpackRequest setSupportedRegionIdsRepeatList(java.util.List<String> supportedRegionIdsRepeatList) {
        this.supportedRegionIdsRepeatList = supportedRegionIdsRepeatList;
        return this;
    }
    public java.util.List<String> getSupportedRegionIdsRepeatList() {
        return this.supportedRegionIdsRepeatList;
    }

    public DescribeBuildpackRequest setTechstackIdsRepeatList(java.util.List<Integer> techstackIdsRepeatList) {
        this.techstackIdsRepeatList = techstackIdsRepeatList;
        return this;
    }
    public java.util.List<Integer> getTechstackIdsRepeatList() {
        return this.techstackIdsRepeatList;
    }

    public DescribeBuildpackRequest setTechstackNamesRepeatList(java.util.List<String> techstackNamesRepeatList) {
        this.techstackNamesRepeatList = techstackNamesRepeatList;
        return this;
    }
    public java.util.List<String> getTechstackNamesRepeatList() {
        return this.techstackNamesRepeatList;
    }

}
