// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListGroupDirectoriesResponseBody extends TeaModel {
    /**
     * <p>The business status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The query root itself and all its descendant directories, including visible referenced directories in the space. The results are not paginated.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("directories")
    public java.util.List<ListGroupDirectoriesResponseBodyDirectories> directories;

    /**
     * <p>The error description.</p>
     * 
     * <strong>example:</strong>
     * <p>The requested resource does not exist</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request trace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The number of returned directories, which equals the length of the directories array.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListGroupDirectoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGroupDirectoriesResponseBody self = new ListGroupDirectoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGroupDirectoriesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListGroupDirectoriesResponseBody setDirectories(java.util.List<ListGroupDirectoriesResponseBodyDirectories> directories) {
        this.directories = directories;
        return this;
    }
    public java.util.List<ListGroupDirectoriesResponseBodyDirectories> getDirectories() {
        return this.directories;
    }

    public ListGroupDirectoriesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListGroupDirectoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGroupDirectoriesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListGroupDirectoriesResponseBodyDirectories extends TeaModel {
        /**
         * <p>The directory description.</p>
         * 
         * <strong>example:</strong>
         * <p>Project description</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The directory ID, including the query root itself and its descendants.</p>
         * 
         * <strong>example:</strong>
         * <p>dir_example</p>
         */
        @NameInMap("directoryId")
        public String directoryId;

        /**
         * <p>The original directory type. The value is GROUP for physical directories in the space. Referenced directories retain their original type.</p>
         * 
         * <strong>example:</strong>
         * <p>GROUP</p>
         */
        @NameInMap("directoryType")
        public String directoryType;

        /**
         * <p>The directory name.</p>
         * 
         * <strong>example:</strong>
         * <p>Project resources</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The parent directory ID. This value is empty for the internal root of the space.</p>
         * 
         * <strong>example:</strong>
         * <p>dir_parent</p>
         */
        @NameInMap("parentDirectoryId")
        public String parentDirectoryId;

        /**
         * <p>Indicates whether the directory is a read-only referenced directory. A value of false still requires creator or administrator permissions to modify the directory. The internal root is always unmodifiable.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("readOnly")
        public Boolean readOnly;

        public static ListGroupDirectoriesResponseBodyDirectories build(java.util.Map<String, ?> map) throws Exception {
            ListGroupDirectoriesResponseBodyDirectories self = new ListGroupDirectoriesResponseBodyDirectories();
            return TeaModel.build(map, self);
        }

        public ListGroupDirectoriesResponseBodyDirectories setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGroupDirectoriesResponseBodyDirectories setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public ListGroupDirectoriesResponseBodyDirectories setDirectoryType(String directoryType) {
            this.directoryType = directoryType;
            return this;
        }
        public String getDirectoryType() {
            return this.directoryType;
        }

        public ListGroupDirectoriesResponseBodyDirectories setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListGroupDirectoriesResponseBodyDirectories setParentDirectoryId(String parentDirectoryId) {
            this.parentDirectoryId = parentDirectoryId;
            return this;
        }
        public String getParentDirectoryId() {
            return this.parentDirectoryId;
        }

        public ListGroupDirectoriesResponseBodyDirectories setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

    }

}
