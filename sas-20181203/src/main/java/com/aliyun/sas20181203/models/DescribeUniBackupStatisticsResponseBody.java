// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeUniBackupStatisticsResponseBody extends TeaModel {
    /**
     * <p>The number of protected database instances.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ProtectedDatabaseCount")
    public Integer protectedDatabaseCount;

    /**
     * <p>The regions of the database instances.</p>
     */
    @NameInMap("RegionCountList")
    public java.util.List<DescribeUniBackupStatisticsResponseBodyRegionCountList> regionCountList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7532B7EE-7CE7-5F4D-BF04-B12447DD****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of the restoration tasks that are running.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RestoringTaskCount")
    public Integer restoringTaskCount;

    /**
     * <p>The total number of database instances that can be restored.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalRecoverableCount")
    public Integer totalRecoverableCount;

    /**
     * <p>The total number of the restoration tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalRestoreTaskCount")
    public Integer totalRestoreTaskCount;

    /**
     * <p>The number of unprotected database instances.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("UnprotectedDatabaseCount")
    public Integer unprotectedDatabaseCount;

    public static DescribeUniBackupStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUniBackupStatisticsResponseBody self = new DescribeUniBackupStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUniBackupStatisticsResponseBody setProtectedDatabaseCount(Integer protectedDatabaseCount) {
        this.protectedDatabaseCount = protectedDatabaseCount;
        return this;
    }
    public Integer getProtectedDatabaseCount() {
        return this.protectedDatabaseCount;
    }

    public DescribeUniBackupStatisticsResponseBody setRegionCountList(java.util.List<DescribeUniBackupStatisticsResponseBodyRegionCountList> regionCountList) {
        this.regionCountList = regionCountList;
        return this;
    }
    public java.util.List<DescribeUniBackupStatisticsResponseBodyRegionCountList> getRegionCountList() {
        return this.regionCountList;
    }

    public DescribeUniBackupStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUniBackupStatisticsResponseBody setRestoringTaskCount(Integer restoringTaskCount) {
        this.restoringTaskCount = restoringTaskCount;
        return this;
    }
    public Integer getRestoringTaskCount() {
        return this.restoringTaskCount;
    }

    public DescribeUniBackupStatisticsResponseBody setTotalRecoverableCount(Integer totalRecoverableCount) {
        this.totalRecoverableCount = totalRecoverableCount;
        return this;
    }
    public Integer getTotalRecoverableCount() {
        return this.totalRecoverableCount;
    }

    public DescribeUniBackupStatisticsResponseBody setTotalRestoreTaskCount(Integer totalRestoreTaskCount) {
        this.totalRestoreTaskCount = totalRestoreTaskCount;
        return this;
    }
    public Integer getTotalRestoreTaskCount() {
        return this.totalRestoreTaskCount;
    }

    public DescribeUniBackupStatisticsResponseBody setUnprotectedDatabaseCount(Integer unprotectedDatabaseCount) {
        this.unprotectedDatabaseCount = unprotectedDatabaseCount;
        return this;
    }
    public Integer getUnprotectedDatabaseCount() {
        return this.unprotectedDatabaseCount;
    }

    public static class DescribeUniBackupStatisticsResponseBodyRegionCountList extends TeaModel {
        /**
         * <p>The number of database instances that are automatically scanned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AutomaticCount")
        public String automaticCount;

        /**
         * <p>The ID of the region in which the database instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static DescribeUniBackupStatisticsResponseBodyRegionCountList build(java.util.Map<String, ?> map) throws Exception {
            DescribeUniBackupStatisticsResponseBodyRegionCountList self = new DescribeUniBackupStatisticsResponseBodyRegionCountList();
            return TeaModel.build(map, self);
        }

        public DescribeUniBackupStatisticsResponseBodyRegionCountList setAutomaticCount(String automaticCount) {
            this.automaticCount = automaticCount;
            return this;
        }
        public String getAutomaticCount() {
            return this.automaticCount;
        }

        public DescribeUniBackupStatisticsResponseBodyRegionCountList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
