// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeGetArrangementInfoReq.proto

package emu.grasscutter.net.proto;

public final class HomeGetArrangementInfoReqOuterClass {
  private HomeGetArrangementInfoReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeGetArrangementInfoReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeGetArrangementInfoReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 scene_id_list = 7;</code>
     * @return A list containing the sceneIdList.
     */
    java.util.List<java.lang.Integer> getSceneIdListList();
    /**
     * <code>repeated uint32 scene_id_list = 7;</code>
     * @return The count of sceneIdList.
     */
    int getSceneIdListCount();
    /**
     * <code>repeated uint32 scene_id_list = 7;</code>
     * @param index The index of the element to return.
     * @return The sceneIdList at the given index.
     */
    int getSceneIdList(int index);
  }
  /**
   * Protobuf type {@code HomeGetArrangementInfoReq}
   */
  public static final class HomeGetArrangementInfoReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeGetArrangementInfoReq)
      HomeGetArrangementInfoReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeGetArrangementInfoReq.newBuilder() to construct.
    private HomeGetArrangementInfoReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeGetArrangementInfoReq() {
      sceneIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeGetArrangementInfoReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HomeGetArrangementInfoReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 56: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                sceneIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              sceneIdList_.addInt(input.readUInt32());
              break;
            }
            case 58: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                sceneIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                sceneIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          sceneIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.HomeGetArrangementInfoReqOuterClass.internal_static_HomeGetArrangementInfoReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HomeGetArrangementInfoReqOuterClass.internal_static_HomeGetArrangementInfoReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HomeGetArrangementInfoReqOuterClass.HomeGetArrangementInfoReq.class, emu.grasscutter.net.proto.HomeGetArrangementInfoReqOuterClass.HomeGetArrangementInfoReq.Builder.class);
    }

    public static final int SCENE_ID_LIST_FIELD_NUMBER = 7;
    private com.google.protobuf.Internal.IntList sceneIdList_;
    /**
     * <code>repeated uint32 scene_id_list = 7;</code>
     * @return A list containing the sceneIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getSceneIdListList() {
      return sceneIdList_;
    }
    /**
     * <code>repeated uint32 scene_id_list = 7;</code>
     * @return The count of sceneIdList.
     */
    public int getSceneIdListCount() {
      return sceneIdList_.size();
    }
    /**
     * <code>repeated uint32 scene_id_list = 7;</code>
     * @param index The index of the element to return.
     * @return The sceneIdList at the given index.
     */
    public int getSceneIdList(int index) {
      return sceneIdList_.getInt(index);
    }
    private int sceneIdListMemoizedSerializedSize = -1;

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (getSceneIdListList().size() > 0) {
        output.writeUInt32NoTag(58);
        output.writeUInt32NoTag(sceneIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < sceneIdList_.size(); i++) {
        output.writeUInt32NoTag(sceneIdList_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < sceneIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(sceneIdList_.getInt(i));
        }
        size += dataSize;
        if (!getSceneIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        sceneIdListMemoizedSerializedSize = dataSize;
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.HomeGetArrangementInfoReqOuterClass.HomeGetArrangementInfoReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HomeGetArrangementInfoReqOuterClass.HomeGetArrangementInfoReq other = (emu.grasscutter.net.proto.HomeGetArrangementInfoReqOuterClass.HomeGetArrangementInfoReq) obj;

      if (!getSceneIdListList()
          .equals(other.getSceneIdListList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getSceneIdListCount() > 0) {
        hash = (37 * hash) + SCENE_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getSceneIdListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HomeGetArrangementInfoReqOuterClass.HomeGetArrangementInfoReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeGetArrangementInfoReqOuterClass.HomeGetArrangementInfoReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeGetArrangementInfoReqOuterClass.HomeGetArrangementInfoReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeGetArrangementInfoReqOuterClass.HomeGetArrangementInfoReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeGetArrangementInfoReqOuterClass.HomeGetArrangementInfoReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeGetArrangementInfoReqOuterClass.HomeGetArrangementInfoReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeGetArrangementInfoReqOuterClass.HomeGetArrangementInfoReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeGetArrangementInfoReqOuterClass.HomeGetArrangementInfoReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeGetArrangementInfoReqOuterClass.HomeGetArrangementInfoReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeGetArrangementInfoReqOuterClass.HomeGetArrangementInfoReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeGetArrangementInfoReqOuterClass.HomeGetArrangementInfoReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeGetArrangementInfoReqOuterClass.HomeGetArrangementInfoReq parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.HomeGetArrangementInfoReqOuterClass.HomeGetArrangementInfoReq prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code HomeGetArrangementInfoReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeGetArrangementInfoReq)
        emu.grasscutter.net.proto.HomeGetArrangementInfoReqOuterClass.HomeGetArrangementInfoReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HomeGetArrangementInfoReqOuterClass.internal_static_HomeGetArrangementInfoReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HomeGetArrangementInfoReqOuterClass.internal_static_HomeGetArrangementInfoReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HomeGetArrangementInfoReqOuterClass.HomeGetArrangementInfoReq.class, emu.grasscutter.net.proto.HomeGetArrangementInfoReqOuterClass.HomeGetArrangementInfoReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HomeGetArrangementInfoReqOuterClass.HomeGetArrangementInfoReq.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        sceneIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HomeGetArrangementInfoReqOuterClass.internal_static_HomeGetArrangementInfoReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeGetArrangementInfoReqOuterClass.HomeGetArrangementInfoReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HomeGetArrangementInfoReqOuterClass.HomeGetArrangementInfoReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeGetArrangementInfoReqOuterClass.HomeGetArrangementInfoReq build() {
        emu.grasscutter.net.proto.HomeGetArrangementInfoReqOuterClass.HomeGetArrangementInfoReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeGetArrangementInfoReqOuterClass.HomeGetArrangementInfoReq buildPartial() {
        emu.grasscutter.net.proto.HomeGetArrangementInfoReqOuterClass.HomeGetArrangementInfoReq result = new emu.grasscutter.net.proto.HomeGetArrangementInfoReqOuterClass.HomeGetArrangementInfoReq(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          sceneIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.sceneIdList_ = sceneIdList_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.HomeGetArrangementInfoReqOuterClass.HomeGetArrangementInfoReq) {
          return mergeFrom((emu.grasscutter.net.proto.HomeGetArrangementInfoReqOuterClass.HomeGetArrangementInfoReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HomeGetArrangementInfoReqOuterClass.HomeGetArrangementInfoReq other) {
        if (other == emu.grasscutter.net.proto.HomeGetArrangementInfoReqOuterClass.HomeGetArrangementInfoReq.getDefaultInstance()) return this;
        if (!other.sceneIdList_.isEmpty()) {
          if (sceneIdList_.isEmpty()) {
            sceneIdList_ = other.sceneIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSceneIdListIsMutable();
            sceneIdList_.addAll(other.sceneIdList_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.HomeGetArrangementInfoReqOuterClass.HomeGetArrangementInfoReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.HomeGetArrangementInfoReqOuterClass.HomeGetArrangementInfoReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList sceneIdList_ = emptyIntList();
      private void ensureSceneIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          sceneIdList_ = mutableCopy(sceneIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 scene_id_list = 7;</code>
       * @return A list containing the sceneIdList.
       */
      public java.util.List<java.lang.Integer>
          getSceneIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(sceneIdList_) : sceneIdList_;
      }
      /**
       * <code>repeated uint32 scene_id_list = 7;</code>
       * @return The count of sceneIdList.
       */
      public int getSceneIdListCount() {
        return sceneIdList_.size();
      }
      /**
       * <code>repeated uint32 scene_id_list = 7;</code>
       * @param index The index of the element to return.
       * @return The sceneIdList at the given index.
       */
      public int getSceneIdList(int index) {
        return sceneIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 scene_id_list = 7;</code>
       * @param index The index to set the value at.
       * @param value The sceneIdList to set.
       * @return This builder for chaining.
       */
      public Builder setSceneIdList(
          int index, int value) {
        ensureSceneIdListIsMutable();
        sceneIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 scene_id_list = 7;</code>
       * @param value The sceneIdList to add.
       * @return This builder for chaining.
       */
      public Builder addSceneIdList(int value) {
        ensureSceneIdListIsMutable();
        sceneIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 scene_id_list = 7;</code>
       * @param values The sceneIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllSceneIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureSceneIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, sceneIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 scene_id_list = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneIdList() {
        sceneIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:HomeGetArrangementInfoReq)
    }

    // @@protoc_insertion_point(class_scope:HomeGetArrangementInfoReq)
    private static final emu.grasscutter.net.proto.HomeGetArrangementInfoReqOuterClass.HomeGetArrangementInfoReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HomeGetArrangementInfoReqOuterClass.HomeGetArrangementInfoReq();
    }

    public static emu.grasscutter.net.proto.HomeGetArrangementInfoReqOuterClass.HomeGetArrangementInfoReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeGetArrangementInfoReq>
        PARSER = new com.google.protobuf.AbstractParser<HomeGetArrangementInfoReq>() {
      @java.lang.Override
      public HomeGetArrangementInfoReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HomeGetArrangementInfoReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HomeGetArrangementInfoReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeGetArrangementInfoReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HomeGetArrangementInfoReqOuterClass.HomeGetArrangementInfoReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeGetArrangementInfoReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeGetArrangementInfoReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037HomeGetArrangementInfoReq.proto\"2\n\031Hom" +
      "eGetArrangementInfoReq\022\025\n\rscene_id_list\030" +
      "\007 \003(\rB\033\n\031emu.grasscutter.net.protob\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HomeGetArrangementInfoReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeGetArrangementInfoReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeGetArrangementInfoReq_descriptor,
        new java.lang.String[] { "SceneIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
